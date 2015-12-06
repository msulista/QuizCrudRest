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
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import model.Produto;
import repositorio.RepositorioProduto;

/**
 * REST Web Service
 *
 * @author marcus.rodrigues
 */
@Path("produtos")
public class ProdutosResource {

    @Context
    private UriInfo context;
    
    @EJB
    private RepositorioProduto repositorio;

    /**
     * Creates a new instance of ProdutosResource
     */
    public ProdutosResource() {
    }

    /**
     * Retrieves representation of an instance of ws.ProdutosResource
     * @return an instance of model.Produto
     */
    @GET
    @Produces("application/json")
    public List<Produto> getProdutos() {
        //TODO return proper representation object
        return repositorio.getProdutos();
    }

    /**
     * PUT method for updating or creating an instance of ProdutosResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @POST
    @Consumes("application/json")
    @Produces("text/plain")
    public String addProduto(Produto produto) {
        repositorio.adiciona(produto);
        return "OK";
    }
}
