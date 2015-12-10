/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import dao.UsuarioDaoBd;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import model.Usuario;

/**
 *
 * @author marcus.rodrigues
 */
@Stateless
public class RepositorioUsuario {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private List<Usuario> usuarios;

    public RepositorioUsuario() {
        this.usuarios = new ArrayList<>();
        //this.usuarios.add(new Usuario("Aluno", "2222.2222", "222@gmail.com", "1234", true));
        //this.usuarios.add(new Usuario("Admin", "1111.1111", "111@gmail.com", "1234", true));
        new UsuarioDaoBd().inserir(new Usuario("Aluno", "2222.2222", "222@gmail.com", "1234", true));
        new UsuarioDaoBd().inserir(new Usuario("Admin", "1111.1111", "111@gmail.com", "1234", true));
    }
    
    public void adiciona(Usuario usuario){
        //this.usuarios.add(usuario);
        new UsuarioDaoBd().inserir(usuario);
        
    }
    
    public List<Usuario> getUsuarios(){
        //return this.usuarios;
        return new UsuarioDaoBd().listar();
    }
    
}
