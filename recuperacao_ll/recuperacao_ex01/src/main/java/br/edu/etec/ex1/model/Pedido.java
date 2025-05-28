/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.ex1.model;

import br.edu.etec.ex1.exceptions.QuantidadeInvalidaException;

/**
 *
 * @author sabri
 */
public class Pedido {
    private Produto produto;
    private int quantidadeSolicitada;

    public Pedido(Produto produto, int quantidadeSolicitada) throws QuantidadeInvalidaException {
        if (quantidadeSolicitada <= 0) {
            throw new QuantidadeInvalidaException("A quantidade solicitada deve ser maior que zero.");
        }
        if (quantidadeSolicitada > produto.getQuantidadeEstoque()) {
            throw new QuantidadeInvalidaException("Quantidade solicitada (" + quantidadeSolicitada + ") excede o estoque disponível (" + produto.getQuantidadeEstoque() + ").");
        }
        this.produto = produto;
        this.quantidadeSolicitada = quantidadeSolicitada;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidadeSolicitada() {
        return quantidadeSolicitada;
    }

    public void gerarResumo() {
        System.out.println("--- Resumo do Pedido ---");
        produto.exibirDetalhes();
        System.out.println("Quantidade Solicitada: " + quantidadeSolicitada);
        System.out.println("Valor Total do Pedido: R$" + produto.getPreco() * quantidadeSolicitada);
    }
    
}
