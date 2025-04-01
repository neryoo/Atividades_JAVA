/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_formas_geometricas;

/**
 *
 * @author sabri
 */
public class Circulo extends Forma{
    double raio;
    
    public Circulo(String nome, double raio){
        super(nome);
        this.raio = raio;
    }
    
    double area(){
        return(3.14*raio*raio);
    }
    
    @Override
        void exibirInformacoes(){
        System.out.println("----------- Sistema Área de Formas Geométricas ----------");
        System.out.println(" ");
        System.out.println("Forma Geométrica: " + nome);
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + area() + "cm²");
    }
}
