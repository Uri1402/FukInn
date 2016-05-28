/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.*;
 
public class Login {
    public static void main( String args[] )
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (Exception e){   
            System.out.println(e);
        }
        Jlogin aplicacion = new Jlogin();
        aplicacion.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
    } 
}