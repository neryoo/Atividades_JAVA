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

public class PassagemPrime extends Passagem{
     private String servicoPersonalizado;

    public PassagemPrime(String nomePassageiro, String destino, double valorPassagem, String servicoPersonalizado) throws ValorPassagemInvalidoException {
        super(nomePassageiro, destino, valorPassagem);
        this.servicoPersonalizado = servicoPersonalizado;
    }

    public String getServicoPersonalizado() {
        return servicoPersonalizado;
    }

    public void setServicoPersonalizado(String servicoPersonalizado) {
        this.servicoPersonalizado = servicoPersonalizado;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("--- Detalhes da Passagem Prime ---");
        System.out.println("Passageiro: " + getNomePassageiro());
        System.out.println("Destino: " + getDestino());
        System.out.println("Valor: R$" + String.format("%.2f", getValorPassagem()));
        System.out.println("Serviço Personalizado: " + servicoPersonalizado);
        System.out.println();
    }
}

