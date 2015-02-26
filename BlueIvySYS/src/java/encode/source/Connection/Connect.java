/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encode.source.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Zetta™
 */
public class Connect {
    public static String status = "Não conectado..";
    
    public Connect(){
    
    }
    
    public static Connection getConnection() throws SQLException {
    
        Connection con = null;
        
        
        try{
            
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            
            String serverName = "localhost";
            String mydatabase = "blue_ivysystem";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "root";
<<<<<<< HEAD
            String password = "123456";
=======
            String password = "oryc666";
>>>>>>> effd3790b486f10ea6768d944761a56e55d83909
            
            con = DriverManager.getConnection(url, username, password);
            
            if (con != null) {
                status = ("STATUS---> Conectado com sucesso.");
            
            }else {
                status = ("STATUS---> Não foi possível realizar a conexão");
            
            }
        return con;
        
        }catch (ClassNotFoundException e) {
        
            System.out.println("O driver especificado não foi encontrado.");
            return null;
        }
        
    }
    
    public static String statusConection() {

        return status;

    }
       
}
