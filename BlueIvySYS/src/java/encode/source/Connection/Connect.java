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
    
    public static Connect getConnection() throws ClassNotFoundException, SQLException{
    
        Connect con = null;
        
        
        try{
            
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            
            String serverName = "localhost";
            String mydatabase = "blue_ivysystem";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "root";
            String password = "oryc666";
            
            con = (Connect) DriverManager.getConnection(url, username, password);
            
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
