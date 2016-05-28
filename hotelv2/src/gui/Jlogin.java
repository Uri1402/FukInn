/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
import db.*;
 
public class Jlogin extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtusuario;
    private JPasswordField txtpassword;
    private JButton btnAceptar, btnCancelar;
    private JLabel lblusuario, lblpassword;
    private Container contenedor;
    private GridLayout cuadricula1;
    public Jlogin()
    {
        super("Acceso al Sistema");
        cuadricula1 = new GridLayout(3, 3, 10, 10);
         
        lblusuario = new JLabel("Usuario:");
        lblpassword = new JLabel("Clave:");
         
        txtusuario = new JTextField(10);
        txtpassword = new JPasswordField(10);
         
        btnAceptar = new JButton("Aceptar");
        btnAceptar.setMnemonic('A');
        ImageIcon imgAceptar = new ImageIcon("img/user_go.png");
        btnAceptar.setIcon(imgAceptar);
         
        btnCancelar = new JButton("Cancelar");
        btnCancelar.setMnemonic('C');
        ImageIcon imgCancelar = new ImageIcon("img/sign_cancel.gif");
        btnCancelar.setIcon(imgCancelar);
         
        contenedor = getContentPane();
        contenedor.setLayout(cuadricula1);
        contenedor.add(lblusuario);
        contenedor.add(txtusuario);
        contenedor.add(lblpassword);
        contenedor.add(txtpassword);
        contenedor.add(btnAceptar);
        contenedor.add(btnCancelar);
         
        btnAceptar.addActionListener( 
            new ActionListener()
            {
                @SuppressWarnings("deprecation")
                public void actionPerformed(ActionEvent evento)
                {
                    DbUsuario user = new DbUsuario();
                    JMain principal = new JMain();
                     
                    String usuario;
                    String clave;
                     
                    usuario = txtusuario.getText();
                    clave = txtpassword.getText();
                     
                    try {
                        Object[][] itemUsuario = user.UsuarioAcceder(usuario, clave);
                        String x_iduser = itemUsuario[0][0].toString();
                        String x_user = itemUsuario[0][1].toString();
                        String x_pass = itemUsuario[0][2].toString();
                        if ((x_user != "") && (x_pass != ""))
                        {
                            JOptionPane.showMessageDialog( Jlogin.this,
                                    "Bienvenido al sistema usuario: " + x_user + ", con id: " + x_iduser,
                                    "Acerca de", JOptionPane.INFORMATION_MESSAGE );
                            principal.setVisible(true);
                            principal.setLocationRelativeTo(principal.getParent());
                            dispose();
                        }
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog( Jlogin.this,
                                "Usuario o contraseña incorrecto",
                                "Acerca de", JOptionPane.ERROR_MESSAGE );
                    }
                }
            }
        );
         
        btnCancelar.addActionListener(
            new ActionListener() {
                public void actionPerformed( ActionEvent evento )
                {
                    System.exit(0);
                }
            }
        );
         
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(300, 150);
        setVisible(true);
        setLocationRelativeTo(this.getParent());
    }
}