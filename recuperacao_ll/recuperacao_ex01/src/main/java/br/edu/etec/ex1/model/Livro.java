/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.ex1.model;

/**
 *
 * @author sabri
 */
public class Livro extends Produto{
    private String autor;
    
    public Livro(String nome, double preco, int quantidadeEstoque, String autor){
        super(nome, preco, quantidadeEstoque);
        this.autor = autor;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    
    @Override
    public void exibirDetalhes(){
        System.out.println("---------- Livro ------------");
        System.out.println("Nome do livro: " + getNome());
        System.out.println("Autor: " + getAutor());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade em estoque: " + getQuantidadeEstoque());
    }
    
}
