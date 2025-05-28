/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.ex1.model;

/**
 *
 * @author sabri
 */
public class Eletronico extends Produto{
    private int garantiaMeses;
    
    public Eletronico(String nome, double preco, int quantidadeEstoque, int garantiaMeses){
    super(nome, preco, quantidadeEstoque);
    this.garantiaMeses = garantiaMeses;
    }
    
    public int getGarantiaMeses(){
    return garantiaMeses;
    }
    
    public void setGarantiaMeses(int garantiaMeses){
    this.garantiaMeses = garantiaMeses;
    }
    
        @Override
    public void exibirDetalhes(){
    System.out.println("---------- Eletronico ------------");
    System.out.println("Eletronico: " + getNome());
    System.out.println("Garantia (meses): " + getGarantiaMeses());
    System.out.println("Preço: " + getPreco());
    System.out.println("Quantidade em estoque: " + getQuantidadeEstoque());
    }
}
