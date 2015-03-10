/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encode.source.SystemCode;


import encode.source.DAO.UserDAO;
import encode.source.javaBean.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Zetta™
 */

@ManagedBean
@ViewScoped
public class UserBean {
    private User usuario = new User();
    private UserDAO userdao = new UserDAO();

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public UserDAO getUserdao() {
        return userdao;
    }

    public void setUserdao(UserDAO userdao) {
        this.userdao = userdao;
    }
    public void inserir() throws SQLException, ClassNotFoundException{
        usuario.setNome(usuario.getNome());
        usuario.setLogin(usuario.getLogin());
        usuario.setPassword(usuario.getPassword());
        usuario.setTelefone(usuario.getTelefone());
        usuario.setCpf(usuario.getCpf());
        usuario.setEmail(usuario.getEmail());
        
        userdao.Inserir(usuario);
    }
    public void deleteUser() throws SQLException, ClassNotFoundException{
        usuario.setCpf(usuario.getCpf());
        
        userdao.DeleteUser(usuario);
    
    }
    
    public List<User> recuperarUser() {
        
        ArrayList<User> lista = new ArrayList<User>();
        
        usuario.setCpf(usuario.getCpf());
        
        userdao.RecuperarUser(usuario);
        return lista;
    }
    
}
