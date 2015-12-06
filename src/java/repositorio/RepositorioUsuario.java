/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

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
        this.usuarios.add(new Usuario("User Rest", "6666.6666", "666@gmail.com", "1234", true));
    }
    
    public void adiciona(Usuario usuario){
        this.usuarios.add(usuario);
    }
    
    public List<Usuario> getUsuarios(){
        return this.usuarios;
    }
    
}
