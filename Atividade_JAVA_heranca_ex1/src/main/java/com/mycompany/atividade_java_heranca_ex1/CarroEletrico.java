/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_java_heranca_ex1;

/**
 *
 * @author Admin
 */
public class CarroEletrico extends Carro{
    
    String capacidadeBateria;
    
       public CarroEletrico(String marca, String modelo, int ano, String tpCombustivel, String capacidadeBateria) {
        super(marca, modelo, ano, tpCombustivel);
        this.capacidadeBateria = capacidadeBateria;
    }
        void eletrico(){
        System.out.println("--------------ALUGUEL DE CARROS-------------");
        System.out.println("*Informações do veículo escolhido*");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Capacidade da bateria: " + capacidadeBateria);
        }
}
