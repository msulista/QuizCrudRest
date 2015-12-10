/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import model.Usuario;
import repositorio.RepositorioUsuario;

/**
 * REST Web Service
 *
 * @author marcus.rodrigues
 */
@Path("usuarios")
public class UsuariosResource {

    @Context
    private UriInfo context;
    
    @EJB
    private RepositorioUsuario repositorio;

    /**
     * Creates a new instance of UsuariosResource
     */
    public UsuariosResource() {
    }

    /**
     * Retrieves representation of an instance of ws.UsuariosResource
     * @return an instance of model.Usuario
     */
    @GET
    @Produces("application/json")
    public List<Usuario> getUsuarios() {
        //TODO return proper representation object
        return repositorio.getUsuarios();
    }

    /**
     * PUT method for updating or creating an instance of UsuariosResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @POST
    @Consumes("application/json")
    @Produces("text/plain")
    public String addUsuario(Usuario usuario) {
        repositorio.adiciona(usuario);
        return "OK";
    }
}
