/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parteb;

import partea.Naipe;
import partea.Palo;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Víctor
 */
public class Baraja {

    public static void main(String[] args) {
        //Atributos 
        ArrayList<Naipe> Baraja = new ArrayList<>();

        //Lo rellenamos
        for (Palo palo : Palo.values()) {
            for (int numero = 1; numero <= 10; numero++) {
                Baraja.add(new Naipe(palo, numero));
            }
        }

        //Mostrar baraja
        for (Naipe naipe : Baraja) {
            System.out.println(naipe);
        }
        
        //EJERCICIO PARA BARAJAR
        barajar(Baraja,20);
        //Mostramos de nuevo la baraja
        System.out.println("Asi queda la Baraja despues de barajar");
        for (Naipe naipe : Baraja) {
            System.out.println(naipe);
        }
        
        //EJERCICIO PARA SACAR CARTA
        ArrayList<Naipe> mano;
        mano = repartir(Baraja,10);
        //Mostramos la mano
        System.out.println("*********MANO*********");
        for (Naipe naipe : mano) {
            System.out.println(naipe);
        }
        System.out.println("**********************");
        //Mostramos como queda la baraja
        System.out.println("****BARAJA RESTANTE*******");
        for (Naipe naipe : Baraja) {
            System.out.println(naipe);
        }
        System.out.println("************************** "
                + "+\"Tamaño de la baraja \" +Baraja.size()");

    }

    //METODO PARA BARAJAR
    public static void barajar(ArrayList<Naipe> baraja, int movimientos) {
        Random r = new Random();
        int aleatorio = 0;
        int aleatorio2=0;
        Naipe temporal;

        for (int i = 0; i < movimientos; i++) {
            //genero un aleatorio para moverme por el indice de la lista 
            aleatorio = r.nextInt(0, baraja.size());
            do{//Bucle para controlar que no se repitan los indices aleatorios
            aleatorio2=r.nextInt(0, baraja.size());
            }while(aleatorio==aleatorio2);
            
            //Esa posicion aleatoria la quiero dejar libre por tanto
            //almaceno el naipe en una variable temporal
            temporal=baraja.get(aleatorio);
            
            //Paso el indice de la posicion 2 al hueco de la posicon del aleatorio 1
            baraja.set(aleatorio, baraja.get(aleatorio2));
            //En la posicion 2, añado el naipe que estaba en la posicion 1
            baraja.set(aleatorio2, temporal);
            
        }

    }
    
    //METODO PARA SACAR CARTAS 
    
    public static ArrayList<Naipe> repartir(ArrayList<Naipe> baraja, int numero){
    //Creamos la lista de array Mano
    ArrayList<Naipe> mano = new ArrayList <Naipe>();
    int aleatorio =0;
    Random r = new Random();
    //Bucle para hacerlo segun el numero de cartas que queremos sacar
    for(int i=0; i<numero; i++){
    aleatorio=r.nextInt(0, baraja.size());
    //Añadimos la carta que ha salido aleatoria a la mano
    mano.add(i, baraja.get(aleatorio));
    //Borramos esa carta de la baraja
    baraja.remove(aleatorio);
    }
    
    return mano;    
    }

}
