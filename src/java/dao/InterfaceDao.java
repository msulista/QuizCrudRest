/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author marcus.rodrigues
 */
public interface InterfaceDao<T> {
    
    public void inserir(T bean);
    public void deletar(T bean);
    public void atualizar(T bean);
    public List listar();
    
}
