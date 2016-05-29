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
public class Cliente {
    private int idC;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String email;
    private double telefono;
    private String login;
    private String pass;
    
    public Cliente(){
        
    }

    public Cliente(int idC, String nombre, String apaterno, String amaterno, String email, double telefono, String login, String pass) {
        this.idC = idC;
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.email = email;
        this.telefono = telefono;
        this.login = login;
        this.pass = pass;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public String getApaterno() {
        return apaterno;
    }

    public String getEmail() {
        return email;
    }

    public int getIdC() {
        return idC;
    }

    public String getLogin() {
        return login;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPass() {
        return pass;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }
    //que la verga
    
}
