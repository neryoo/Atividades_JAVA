/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.ex2.model;

/**
 *
 * @author sabri
 */

import br.edu.etec.ex2.exceptions.ClasseInvalidaException;
import br.edu.etec.ex2.exceptions.ValorPassagemInvalidoException;

public class Passagem {
    private String nomePassageiro;
    private String destino;
    private double valorPassagem;

    public Passagem(String nomePassageiro, String destino, double valorPassagem) throws ValorPassagemInvalidoException {
        this.nomePassageiro = nomePassageiro;
        this.destino = destino;
        setValorPassagem(valorPassagem); // Usa o setter para validação
    }

    // Getters
    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public String getDestino() {
        return destino;
    }

    public double getValorPassagem() {
        return valorPassagem;
    }

    // Setter com validação
    public void setValorPassagem(double valorPassagem) throws ValorPassagemInvalidoException {
        if (valorPassagem < 100.00) {
            throw new ValorPassagemInvalidoException("O valor da passagem deve ser no mínimo R$100,00.");
        }
        this.valorPassagem = valorPassagem;
    }

 
    public void mostrarDetalhes(){
    };
}

