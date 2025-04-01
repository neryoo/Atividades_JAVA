/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_formas_geometricas;

/**
 *
 * @author sabri
 */
public class Quadrado extends Retangulo{
    double lado;
    
    public Quadrado(String nome, double h, double b, double lado){
        super(nome, h, b);
        this.lado = lado;
    }
    
 @Override
    double area(){
        return(lado*lado);
    }
    
    @Override
        void exibirInformacoes(){
        System.out.println("----------- Sistema Área de Formas Geométricas ----------");
        System.out.println(" ");
        System.out.println("Forma Geométrica: " + nome);
        System.out.println("Medida do quadrado(lado):  " + lado);
        System.out.println("Área: " + area() + "cm");
    }
}
