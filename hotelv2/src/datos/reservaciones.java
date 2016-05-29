/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import java.sql.Date;

/**
 *
 * @author Uri
 */
public class reservaciones {
    private int idR;
    private int idH;
    private int idC;
    private Date fecha_reservacion;
    private Date fecha_ingreso;
    private Date fecha_salida;
    private double costo_total;

    public reservaciones() {
    }

    public reservaciones(int idR, int idH, int idC, Date fecha_reservacion, Date fecha_ingreso, Date fecha_salida, double costo_total) {
        this.idR = idR;
        this.idH = idH;
        this.idC = idC;
        this.fecha_reservacion = fecha_reservacion;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
        this.costo_total = costo_total;
    }

    public double getCosto_total() {
        return costo_total;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public Date getFecha_reservacion() {
        return fecha_reservacion;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public int getIdC() {
        return idC;
    }

    public int getIdH() {
        return idH;
    }

    public int getIdR() {
        return idR;
    }

    public void setCosto_total(double costo_total) {
        this.costo_total = costo_total;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public void setFecha_reservacion(Date fecha_reservacion) {
        this.fecha_reservacion = fecha_reservacion;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public void setIdH(int idH) {
        this.idH = idH;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }
}
