/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
465465
 */
package db;
import java.sql.*;
 
public class DbUsuario {
    DbConnection cn;
    public DbUsuario() {
        cn = new DbConnection();
    }
    public Object[][] UsuarioAcceder(String login, String password){
        int registros = 0;
        try {
            PreparedStatement pstm = cn.getConnection().prepareStatement("SELECT count(1) as cont" +
            " FROM cliente");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("cont");
            res.close();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        Object [][] data = new Object[registros][3];
        if (login.length() != 0 && password.length() != 0){
            int usu_id;
            String usu_login = "";
            String usu_password = "";
            try {
                String strsql = "";
                strsql = "SELECT * FROM cliente WHERE login = '" + login + "' AND pass = '" + password + "'";
                PreparedStatement pstm = cn.getConnection().prepareStatement(strsql);
                ResultSet res = pstm.executeQuery();
                int i = 0;
                while(res.next()){
                    usu_id = res.getInt("idC");
                    usu_login = res.getString("login");
                    usu_password = res.getString("pass");
                    data[i][0] = usu_id;
                    data[i][1] = usu_login;
                    data[i][2] = usu_password;
                    i++;
                }
                res.close();
            }
            catch(SQLException e){
                System.out.println(e);
            }
        }
        return data;
    }
}

