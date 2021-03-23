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
public final class Servidor extends Equipo {
    private String cod;
    private String ubicacion;
    private double precio;
    private boolean protegido;//true protegido false no protegido
    private String So;
    private int anoCompra;

    public Servidor(String cod, String ubicacion, double precio, boolean protegido, String So, int anoCompra) {
       super(cod, ubicacion, precio, protegido);
        this.So = So;
        this.anoCompra = anoCompra;
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
     * @return the anoCompra
     */
    public int getAnoCompra() {
        return anoCompra;
    }

    /**
     * @param anoCompra the anoCompra to set
     */
    public void setAnoCompra(int anoCompra) {
        this.anoCompra = anoCompra;
    }
    
}
