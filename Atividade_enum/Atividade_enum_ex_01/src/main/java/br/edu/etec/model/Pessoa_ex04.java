/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.model;

/**
 *
 * @author sabri
 */
public class Pessoa_ex04 {
     // Variável para armazenar a região de origem
   private RegiaoBrasil_ex04 regiao;
   
   // Construtor da classe Pessoa
   public Pessoa_ex04(RegiaoBrasil_ex04 regiao) {
       this.regiao = regiao;
   }
   // Método para exibir a região de origem
   public void exibirRegiao() {
       System.out.println("A pessoa eh da regiao: " + regiao);
   }
   // Método para mudar a região da pessoa
   public void mudarRegiao(RegiaoBrasil_ex04 novaRegiao) {
       regiao = novaRegiao;
       System.out.println("A pessoa agora eh da regiao: " + regiao);
   } 
}
