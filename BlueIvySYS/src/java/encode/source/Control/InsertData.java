/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encode.source.Control;

import encode.source.Connection.Connect;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Zetta™
 */
public class InsertData {

    public void NewUser(String nome, String login, String password,
            String telefone, String cpf, String email) {
        Connect c = new Connect();

        try {

            Connection ExCon = c.openCon();
            Statement stmt = (Statement) ExCon.createStatement();
            String sql = "INSERT INTO blue_ivysystem.usuario VALUES (null,"
                    + "'" + nome + "','" + login + "','" + password + "','"
                    + telefone + "','" + cpf + "','" + email + "');";
            boolean res = stmt.execute(sql);
            JOptionPane.showMessageDialog(null, (!res) ? "Dados inseridos com "
                    + "sucesso!!" : ""
                    + "Os dados não puderam ser inseridos!!");
            System.out.println(sql);
            stmt.close();
            c.closeCon();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Os dados não puderam ser "
                    + "inseridos!!");
        }

    }

}
