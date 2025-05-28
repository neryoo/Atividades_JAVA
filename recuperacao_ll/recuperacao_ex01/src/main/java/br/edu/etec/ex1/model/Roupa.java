/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.ex1.model;

/**
 *
 * @author sabri
 */
public class Roupa extends Produto{
    private String tamanho;
    
    public Roupa(String nome, double preco, int quantidadeEstoque, String tamanho){
    super(nome, preco, quantidadeEstoque);
    this.tamanho = tamanho;
    }
    
    public String getTamanho(){
    return tamanho;
    }
    
    public void setTamanho(String tamanho){
    this.tamanho = tamanho;
    }
    
    @Override
    public void exibirDetalhes(){
    System.out.println("---------- Roupa ------------");
    System.out.println("Tipo de roupa: " + getNome());
    System.out.println("Tamanho: " + getTamanho());
    System.out.println("Preço: " + getPreco());
    System.out.println("Quantidade em estoque: " + getQuantidadeEstoque());
    }
}
