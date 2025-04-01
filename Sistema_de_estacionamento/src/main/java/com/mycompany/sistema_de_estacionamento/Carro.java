/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_estacionamento;

/**
 *
 * @author sabri
 */
public class Carro extends Veiculo{
    
    int numPortas;

    public Carro(String modelo, String placa, int ano, int numPortas) {
        super(modelo, placa, ano);
        this.numPortas = numPortas;
    }
        
    @Override
        void exibirInformacoes(){
        System.out.println("----------- INFORMAÇÕES DO CARRO -------------");
        System.out.println("");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
        System.out.println("Número de portas: " + numPortas);
    }
}
