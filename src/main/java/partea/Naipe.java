/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partea;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Víctor
 */
public class Naipe {
    
    // Atributos
    private Palo palo;
    private int numero; 
    
    // Constructor Aleatorio
    
    public Naipe() {
        
        //Objeto Random
        Random a = new Random();
        
        Palo paloAleatorio[] = Palo.values();
        this.palo = paloAleatorio[a.nextInt(paloAleatorio.length)];
        
        //Numero Aleatorio
        int numero = a.nextInt(1, 11);
        this.numero = numero;
    }
    
    //Constructor Parametrizado

    public Naipe(Palo palo, int Numero) {
        this.palo = palo;
        if(Numero<1||Numero>10){
            throw new IllegalArgumentException ("Numero incorrecto. Entre 1 y 10");
        }
        this.numero = Numero;
    }
    
    //GETTERS AND SETTERS

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int Numero) {
        if(Numero<1||Numero>10){
            throw new IllegalArgumentException ("Numero incorrecto. Entre 1 y 10");
        }
        this.numero = Numero;
    }
    
    // To String

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naipe{");
        if(numero==8){
            sb.append("Numero=").append("Sota");
            sb.append(" palo=").append(palo);
            sb.append('}');
        }
        else if(numero==9){
            sb.append("Numero=").append("Caballo");
            sb.append(" palo=").append(palo);
            sb.append('}');
        }
        else if(numero==10){
            sb.append("Numero=").append("Rey");
            sb.append(" palo=").append(palo);
            sb.append('}');
        }
        else {
        sb.append("palo=").append(palo);
        sb.append(" Numero=").append(numero);
        sb.append('}');
        }
       
        return sb.toString();
    }
    
    //Metodo equals

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.palo);
        hash = 79 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Naipe other = (Naipe) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.palo == other.palo;
    }


   
    
    
    
    
    
}
