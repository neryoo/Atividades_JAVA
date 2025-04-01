/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_formas_geometricas;

/**
 *
 * @author sabri
 */
public class Forma {
    String nome;
    
    public Forma(String nome){
        this.nome = nome;
    }
    
    void exibirInformacoes(){
        System.out.println("----------- Sistema Área de Formas Geométricas ----------");
        System.out.println(" ");
        System.out.println("Forma Geométrica: " + nome);
    }
}
