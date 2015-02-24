/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package encode.source.SystemCode;

import encode.source.Connection.ConFactory;
import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;
import java.sql.*;

/**
 *
 * @author Zetta™
 */

@ManagedBean
public class UserBean {
    private String name;
    private String adress;
    private String email;
    private String phone;
    private String login;
    private String password;
    private String CPF;
    
    public UserBean() throws SQLException{
    Connection con = ConFactory.getConnection();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
    public void send(ActionEvent send) throws SQLException{
   
        this.setName(this.getName());
        this.setLogin(this.getLogin());
        this.setPassword(this.getPassword());
        this.setCPF(this.getCPF());
        this.setAdress(this.getAdress());
        this.setEmail(this.getEmail());
        this.setPhone(this.getPhone());
    }
    
}
