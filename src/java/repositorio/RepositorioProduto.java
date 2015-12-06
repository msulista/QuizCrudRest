/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import model.Produto;

/**
 *
 * @author marcus.rodrigues
 */
@Stateless
public class RepositorioProduto {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    List<Produto> produtos;

    public RepositorioProduto() {
        this.produtos = new ArrayList<>();
        produtos.add(new Produto("Sportster 883", 35000.00));
        produtos.add(new Produto("Electra Super Glide", 65000.00));
    }
    
    public void adiciona(Produto produto){
        this.produtos.add(produto);
    }
    
    public List<Produto> getProdutos(){
        return this.produtos;
    }
    
}
