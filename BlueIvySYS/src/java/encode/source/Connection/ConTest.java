/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encode.source.Connection;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class ConTest {
    public static void main(String[] args) throws SQLException {
        Connection conn = new ConFactory().getConnection();
        System.out.println("Conexão aberta!");
        conn.close();
    }
}
