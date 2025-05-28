/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.ex1.model;

/**
 *
 * @author sabri
 */
import br.edu.etec.ex1.exceptions.PrecoInvalidoException;
import br.edu.etec.ex1.exceptions.QuantidadeInvalidaException;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    
    public Produto(String nome, double preco, int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setPreco(double preco) throws PrecoInvalidoException{
     if (preco <= 0) {
         throw new PrecoInvalidoException("O preço deve ser maior que zero.");
        }
        this.preco = preco;
    }
    
    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }
    
    public void setQuantidadeEstoque(int quantidadeEstoque) throws QuantidadeInvalidaException{
       if (quantidadeEstoque < 0) {
         throw new QuantidadeInvalidaException("A quantidade em estoque não pode ser negativa.");
        }
        this.quantidadeEstoque = quantidadeEstoque;
        
    }
    
    
    public void exibirDetalhes(){
    }
    
}
