/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marcus.rodrigues
 */
@XmlRootElement
public class Usuario implements Serializable{
    
    private Integer id;
    private String nome;
    private String telefone;
    private String email;
    private String senha;
    private boolean admin;
        
    public Usuario() {
    }   

    public Usuario(String nome, String telefone, String email, String senha, boolean admin) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    public boolean verificaLogin(String email, String senha){
        
        return (this.email.equalsIgnoreCase(email) && this.senha.equalsIgnoreCase(senha));
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", admin=" + admin + '}';
    }

    
}
