/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_formas_geometricas;

/**
 *
 * @author sabri
 */
public class Retangulo extends Forma{
    double h;
    double b;
    
    public Retangulo(String nome, double h, double b){
        super(nome);
        this.h = h;
        this.b = b;
    }
    
    double area(){
        return(b*h);
    }
    
    @Override
        void exibirInformacoes(){
        System.out.println("----------- Sistema Área de Formas Geométricas ----------");
        System.out.println(" ");
        System.out.println("Forma Geométrica: " + nome);
        System.out.println("Altura: " + h);
        System.out.println("Base (largura): " + b);
        System.out.println("Área: " + area() + "cm");
    }
}