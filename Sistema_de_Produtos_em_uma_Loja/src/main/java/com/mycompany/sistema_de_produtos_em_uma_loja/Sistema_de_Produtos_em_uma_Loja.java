/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_de_produtos_em_uma_loja;

/**
 *
 * @author sabri
 */
public class Sistema_de_Produtos_em_uma_Loja {

    public static void main(String[] args) {
        Produto p1 = new Produto("Meia", 7.99);
        p1.exibirDetalhes();
        
        
        ProdutoComDesconto p2 = new ProdutoComDesconto("Tênis", 150.00, 10);
        p2.exibirDetalhesComDesconto();
        
    }
}
