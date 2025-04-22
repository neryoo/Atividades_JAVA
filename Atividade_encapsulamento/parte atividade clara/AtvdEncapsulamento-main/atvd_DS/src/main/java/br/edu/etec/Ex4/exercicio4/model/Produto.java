/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio4.model;

/**
 *
 * @author CLARA
 */
public class Produto {
   private String nome;
   private double preco;
   private int qntd;

  
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public double getPreco() {
        return preco;
    }

    
    public void setPreco(double preco) {
        if(preco < 0){
            System.out.println("Preço inválido, insira outro");  
        }else{
        this.preco = preco;
    }
    }
    
    public int getQntd() {
        return qntd;
    }

    
    public void setQntd(int qntd) {
        this.qntd = qntd;
    }
    
    public double calcularVT() {
    return this.preco * this.qntd;
}
}
