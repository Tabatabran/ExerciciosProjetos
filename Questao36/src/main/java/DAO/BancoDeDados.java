/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import projeto.model.Produto;

/**
 *
 * @author tabat
 */
public class BancoDeDados {
    private final ArrayList<Produto> produtos;
    private static BancoDeDados instancia;

    private BancoDeDados() {
        this.produtos = new ArrayList<>();
    }
    
    public static BancoDeDados getInstancia(){
        if (instancia == null){
            instancia = new BancoDeDados(); 
        }
        
        return instancia;
    }

    public ArrayList<Produto> getProdutos() throws Exception{
        if(produtos == null){
            throw new Exception("O banco de dados está fazio");
        }
        return produtos;
    }
    
    
    public void add(Produto produto){
        produtos.add(produto);
    }
}
