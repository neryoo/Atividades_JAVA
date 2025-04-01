/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_estacionamento;

/**
 *
 * @author sabri
 */
public class Moto extends Veiculo{
    int cilindrada;
    
    public Moto(String modelo, String placa, int ano, int cilindrada){
        super(modelo, placa, ano);
        this.cilindrada = cilindrada;
    }
    
    @Override
        void exibirInformacoes(){
        System.out.println("----------- INFORMAÇÕES DA MOTO -------------");
        System.out.println("");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
        System.out.println("Cilindrada: " + cilindrada);
    }
}
