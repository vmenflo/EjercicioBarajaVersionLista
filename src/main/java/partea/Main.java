/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partea;

/**
 *
 * @author Víctor
 */
public class Main {
    public static void main(String[] args) {
        //PARTE A
        //Generar un Naipe aleatorio
        Naipe aleatorio = new Naipe();
        System.out.println(aleatorio);
        
        // Generar un Naipe con parametros
        Naipe carta = new Naipe(Palo.BASTOS,10);
        System.out.println(carta);
        
        // Generar naipes hasta que salga el rey de oros
        Naipe reyOros = new Naipe(Palo.OROS,10);
        boolean acierto=false;
        int intentos=0;
        Naipe acertar;
       do{
            acertar = new Naipe();
            System.out.println("La carta sacada es: " + acertar);
            intentos++;
        }while(!acertar.equals(reyOros));
        
        System.out.println("Ha salido " + acertar + " en el intento " + intentos);
        
        //PARTE B
        
        
    }
}
