/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package partea;

/**
 *
 * @author Víctor
 */
public enum Palo {
    
    OROS("oro"), BASTOS("basto"), ESPADAS("espada"), COPAS("copa");
    
    private final String descripcion;

    //Constructor
    private Palo(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //Getter 

    public String getDescripcion() {
        return descripcion;
    }
}
