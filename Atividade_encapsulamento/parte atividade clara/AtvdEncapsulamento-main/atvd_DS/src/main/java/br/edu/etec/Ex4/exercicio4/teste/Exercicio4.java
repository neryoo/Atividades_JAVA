/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio4.teste;

import br.edu.etec.exercicio4.model.Produto;

/**
 *
 * @author CLARA
 */
public class Exercicio4 {
    public static void main(String[] args){
   Produto p1 = new Produto(); 
   Produto p2 = new Produto(); 
   Produto p3 = new Produto(); 
   ////p1
   ///
   p1.setNome("Camiseta");
   p1.setPreco(- 12.4);
   p1.setQntd(3);
   //p2
   
   p2.setNome("Calça");
   p2.setPreco(- 128.6);
   p2.setQntd(1);
   //////////p3
   ///
   p3.setNome("Blusa");
   p3.setPreco(58.10);
   p3.setQntd(8);
           
        System.out.println("--------------- PRODUTOS -----------------");
        System.out.println("NOME: " + p1.getNome());
        System.out.println("PREÇO: R$ " + p1.getPreco());
        System.out.println("QUANTIDADE: " + p1.getQntd());
        System.out.println("TOTAL: R$ " + p1.calcularVT());
  
        System.out.println("-------------------------------------------");
         System.out.println("NOME: " + p2.getNome());
        System.out.println("PREÇO: R$ " + p2.getPreco());
        System.out.println("QUANTIDADE: " + p2.getQntd());
        System.out.println("TOTAL: R$ " + p2.calcularVT());

        
         System.out.println("-------------------------------------------");
         System.out.println("NOME: " + p3.getNome());
        System.out.println("PREÇO: R$ " + p3.getPreco());
        System.out.println("QUANTIDADE: " + p3.getQntd());
        System.out.println("TOTAL: R$ " + p3.calcularVT());

  
  
    
}
}
