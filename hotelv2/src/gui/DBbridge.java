/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class DBbridge {
    //Declaración de variables
    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    public void NuevoCliente(int idC,String nombre,String apaterno,String amaterno,String email,String telefono,String login,String pass) throws Exception {
        try {
            // Cargamos nuestro Driver
            Class.forName("com.mysql.jdbc.Driver");
            // Nos conectamos con la BD 
            connect = DriverManager.getConnection("jdbc:mysql://localhost/dbhotel?" + "user=root&password=laconchadetumadre1");

            // Los Statement nos permiten mandar comandos a MySQL
            statement = connect.createStatement();
            // ResultSet nos permite obtener un resultado de la base
            resultSet = statement.executeQuery("select * from dbhotel.cliente");
            writeResultSet(resultSet);

            // los PreparedStatement nos permiten usar variables y son m[as eficientes
            preparedStatement = connect.prepareStatement("insert into  dbhotel.clientes values (default, ?, ?, ?, ? , ?, ?,?,?)");
            // "myuser, webpage, datum, summery, COMMENTS from feedback.comments");
            // Parameters start with 1
            preparedStatement.setInt(1, idC);
            preparedStatement.setString(2, nombre);
            preparedStatement.setString(3, apaterno);
            preparedStatement.setString(4, amaterno);
            preparedStatement.setString(5, email);
            preparedStatement.setString(6, telefono);
            preparedStatement.setString(7, login);
            preparedStatement.setString(8, pass);
            preparedStatement.executeUpdate();
        } 
        catch (ClassNotFoundException | SQLException e) {
            throw e;
        } 
        finally {
            close();
        }
    }
    private void writeResultSet(ResultSet resultSet) throws SQLException {
    // ResultSet is initially before the first data set
    while (resultSet.next()) {
      // It is possible to get the columns via name
      // also possible to get the columns via the column number
      // which starts at 1
      // e.g. resultSet.getSTring(2);
      String user = resultSet.getString("myuser");
      String website = resultSet.getString("webpage");
      String summery = resultSet.getString("summery");
      Date date = resultSet.getDate("datum");
      String comment = resultSet.getString("comments");
      System.out.println("User: " + user);
      System.out.println("Website: " + website);
      System.out.println("Summery: " + summery);
      System.out.println("Date: " + date);
      System.out.println("Comment: " + comment);
    }
  }
    private void close() {
    try {
      if (resultSet != null) {
        resultSet.close();
      }

      if (statement != null) {
        statement.close();
      }

      if (connect != null) {
        connect.close();
      }
    } catch (Exception e) {

    }
  }
 
}