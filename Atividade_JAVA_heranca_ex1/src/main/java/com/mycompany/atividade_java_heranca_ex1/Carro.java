/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_java_heranca_ex1;

/**
 *
 * @author Admin
 */
public class Carro extends Veiculo {
    
    String tpCombustivel;
    
    public Carro(String marca, String modelo, int ano, String tpCombustivel) {
        super(marca, modelo, ano);
        this.tpCombustivel = tpCombustivel;
    }
    
    void combustivel(){
        System.out.println("--------------ALUGUEL DE CARROS-------------");
        System.out.println("*Informações do veículo escolhido*");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Tipo de combustível: " + tpCombustivel);
    }
    
    
}
