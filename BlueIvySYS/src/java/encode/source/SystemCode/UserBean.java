/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encode.source.SystemCode;

import encode.source.Connection.Connect;
import encode.source.Control.InsertData;
import java.sql.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Zetta™
 */
@ManagedBean
@SessionScoped
public class UserBean {

    private String nome;
    private String email;
    private String telefone;
    private String login;
    private String password;
    private String cpf;
    Connection conn = null;

    InsertData in = new InsertData();

    public UserBean() {
        Connect c = new Connect();
        conn = c.openCon();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void send(ActionEvent send) throws SQLException {

        String nome = this.getNome();
        String login = this.getLogin();
        String password = this.getPassword();
        String cpf = this.getCpf();
        String email = this.getEmail();
        String telefone = this.getTelefone();

        in.NewUser(nome, login, password, telefone, cpf, email);
    }

}
