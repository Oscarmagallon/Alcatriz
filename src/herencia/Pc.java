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
public  final class Pc extends Equipo {
    
    private String So;
    private String tipo;

    public Pc(String cod, String ubicacion, double precio, boolean protegido, String So, String tipo) {
       super(cod, ubicacion, precio, protegido);
        this.So = So;
        this.tipo = tipo;
    }


    /**
     * @return the So
     */
    public String getSo() {
        return So;
    }

    /**
     * @param So the So to set
     */
    public void setSo(String So) {
        this.So = So;
    }

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
}
