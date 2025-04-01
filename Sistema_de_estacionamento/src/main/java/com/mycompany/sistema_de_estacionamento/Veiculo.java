/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_estacionamento;

/**
 *
 * @author sabri
 */
public class Veiculo {
    String modelo;
    String placa;
    int ano;
    
    public Veiculo(String modelo, String placa, int ano){
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }
    
    void exibirInformacoes(){
        System.out.println("----------- SISTEMA DE ESTACIONAMENTO -------------");
        System.out.println("----------- INFORMAÇÕES DO VEÍCULO -------------");
        System.out.println("");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    }
}
