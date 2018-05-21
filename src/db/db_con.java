/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Wahib
 */
public class db_con {
    Connection connection;
    String url = "jdbc:postgres://localhost:5432/rental";
    String username = "postgres";
    String password = "wahib009";

    db_con(String root, String string, String db_pbo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Connection dbConnection(){
        try{
            Class.forName("org.postgresql.Driver");
        }
        catch(ClassNotFoundException e){
            e.getMessage();
        }
        try{
            DriverManager.getConnection(url, username, password);
            JOptionPane.showMessageDialog(null, "Terhubung ke Database");
        }
        catch(SQLException ex){
            Logger.getLogger(db_con.class.getName()).log(Level.SEVERE,null, ex);
            JOptionPane.showMessageDialog(null, "Gagal Terhubung");
        }
       return connection;
}
    }
    
