/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_java_heranca_ex1;

/**
 *
 * @author Admin
 */
public class Veiculo {
    String marca;
    String modelo;
    int ano;
    
    Veiculo(String marca, String modelo, int ano){
      this.marca = marca;
      this.modelo = modelo;
      this.ano = ano;
    }
    
    
    void informacoes(){
        System.out.println("--------------ALUGUEL DE CARROS-------------");
        System.out.println("*Informações do veículo escolhido*");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
