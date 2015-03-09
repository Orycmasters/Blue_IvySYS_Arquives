/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encode.source.DAO;

import encode.source.Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import encode.source.javaBean.User;

/**
 *liaradepaula@hotmail.com
 * @author jaiany
 */
public class UserDAO {

    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;

    public UserDAO(){   
          this.conexao = new ConnectionFactory().getConnection();
          
        
    }

    public boolean Inserir(User usuario) throws SQLException, ClassNotFoundException {
        String sql = "insert into blue_ivysystem.usuario (nome,login,password,telefone,cpf,email) "
                + "values (?,?,?,?,?,?)";
        try {

            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getLogin());
            pstm.setString(3, usuario.getPassword());
            pstm.setString(4, usuario.getTelefone());
            pstm.setString(5, usuario.getCpf());
            pstm.setString(6, usuario.getEmail());
            System.out.println(usuario.getNome());
            int inserir = pstm.executeUpdate();
            if (inserir == 1) {
                return true;

            }

        }catch(SQLException ex){
            ex.printStackTrace();
         
            
        }
        
        return true;
    }
    
    public boolean DeleteUser(User usuario){
        String sql = "DELETE FROM blue_ivysystem.usuario WHERE cpf = ?;";
        try{
            
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, usuario.getCpf());
            pstm.executeUpdate();
            pstm.close();
        
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return false;
    }
}
