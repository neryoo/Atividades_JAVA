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

public class PassagemEconomica extends Passagem {
    private boolean bagagemInclusa;

    public PassagemEconomica(String nomePassageiro, String destino, double valorPassagem, boolean bagagemInclusa) throws ValorPassagemInvalidoException {
        super(nomePassageiro, destino, valorPassagem);
        this.bagagemInclusa = bagagemInclusa;
    }

    public boolean isBagagemInclusa() {
        return bagagemInclusa;
    }

    public void setBagagemInclusa(boolean bagagemInclusa) {
        this.bagagemInclusa = bagagemInclusa;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("--- Detalhes da Passagem Econômica ---");
        System.out.println("Passageiro: " + getNomePassageiro());
        System.out.println("Destino: " + getDestino());
        System.out.println("Valor: R$" + String.format("%.2f", getValorPassagem()));
        System.out.println("Bagagem Inclusa: " + (bagagemInclusa ? "Sim" : "Não"));
        System.out.println();
    }
}

