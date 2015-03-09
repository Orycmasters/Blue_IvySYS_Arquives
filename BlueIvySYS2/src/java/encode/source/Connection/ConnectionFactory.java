package encode.source.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaiany
 */
public class ConnectionFactory {
    Connection conexao = null;
    private String Driver="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://localhost:3306/blue_ivysystem";
    private String usuario ="root";
    private String senha = "123456";
    
    public Connection getConnection(){
        try{
            Class.forName(Driver);
            return DriverManager.getConnection(url,usuario,senha);
        } catch(SQLException sqlex){
            sqlex.printStackTrace();
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
        
        return conexao = new ConnectionFactory().getConnection();
    }
    
    
}
