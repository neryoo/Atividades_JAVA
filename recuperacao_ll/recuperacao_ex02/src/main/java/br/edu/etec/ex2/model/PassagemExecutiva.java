/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.ex2.model;

/**
 *
 * @author sabri
 */

import br.edu.etec.ex2.exceptions.ValorPassagemInvalidoException;

public class PassagemExecutiva extends Passagem{
    private int numeroRefeicoes;

    public PassagemExecutiva(String nomePassageiro, String destino, double valorPassagem, int numeroRefeicoes) throws ValorPassagemInvalidoException {
        super(nomePassageiro, destino, valorPassagem);
        this.numeroRefeicoes = numeroRefeicoes;
    }

    public int getNumeroRefeicoes() {
        return numeroRefeicoes;
    }

    public void setNumeroRefeicoes(int numeroRefeicoes) {
        this.numeroRefeicoes = numeroRefeicoes;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("--- Detalhes da Passagem Executiva ---");
        System.out.println("Passageiro: " + getNomePassageiro());
        System.out.println("Destino: " + getDestino());
        System.out.println("Valor: R$" + String.format("%.2f", getValorPassagem()));
        System.out.println("Número de Refeições: " + numeroRefeicoes);
        System.out.println();
    }
}
    

