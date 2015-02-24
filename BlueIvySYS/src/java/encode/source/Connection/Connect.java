/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encode.source.Connection;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;

/**
 *
 * @author Zetta™
 */
public class Connect {

    Connection con;
    private Connection eCon;
    private Statement stmt;

    public Connect() {
    }

    public Connection openCon() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/blue_ivysystem";
            con = (Connection) DriverManager.getConnection(url, "root", "oryc666");
            System.out.println("Conexão efetuada com sucesso");
            return con;
        } catch (Exception e) {
            System.out.println("Erro ao conectar com Banco de Dados:");
            e.printStackTrace();
            return null;
        }
    }

    public void closeCon() {
        try {
            con.close();
            System.out.println("Conexao finalizada com sucesso");

        } catch (Exception e) {
            System.out.println("Erro ao fechar conexao com banco " + e.getMessage());
        }
    }
}