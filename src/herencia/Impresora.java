/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author daw-A
 */
public final class Impresora extends Equipo  {
    
    private String tipo;

    
    /**
     * @return the cod
     */

    /**
     * @return the tipo
     */
    
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Impresora(String cod, String ubicacion, double precio, boolean protegido, String tipo) {
       super(cod, ubicacion, precio, protegido);
        this.tipo = tipo;
    }
    
}
