/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Uri
 */
public class habitaciones {
    private int idH;
    private int numero;
    private int piso;
    private String tipo;
    private String estado;

    public habitaciones() {
    }

    public habitaciones(int idH, int numero, int piso, String tipo, String estado) {
        this.idH = idH;
        this.numero = numero;
        this.piso = piso;
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public int getIdH() {
        return idH;
    }

    public int getNumero() {
        return numero;
    }

    public int getPiso() {
        return piso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setIdH(int idH) {
        this.idH = idH;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
