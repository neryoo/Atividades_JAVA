/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_produtos_em_uma_loja;

/**
 *
 * @author sabri
 */
public class Produto {
        String nome;
        double preco;
        
        public Produto(String nome, double preco){
            this.nome = nome;
            this.preco = preco;
        }
        
        void exibirDetalhes(){
            System.out.println("-------------INFORMAÇÕES PRODUTO------------");
            System.out.println("Produto: " + nome);
            System.out.println("Preço: " + preco);
        }
}
