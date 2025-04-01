/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_produtos_em_uma_loja;

/**
 *
 * @author sabri
 */
public class ProdutoComDesconto extends Produto {
    double desconto;
    
    public ProdutoComDesconto(String nome, double preco, double desconto){
        super(nome, preco);
        this.desconto = desconto;
    }
        
        void exibirDetalhesComDesconto(){
        System.out.println("------PRODUTOS ACIMA DE R$100,00 TEM DE DESCONTO------");
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Desconto (" + desconto + "% ): " + desconto());
        System.out.println("Total com desconto: " + (preco - desconto()));
    }
        
        double desconto(){
            return(desconto/100*preco);
        }
}
