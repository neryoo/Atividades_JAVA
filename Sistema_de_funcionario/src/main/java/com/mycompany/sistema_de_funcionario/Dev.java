/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_funcionario;

/**
 *
 * @author sabri
 */
public class Dev extends Funcionario{
    String linguagem;
    
    public Dev(String nome, int idade, double salario, String linguagem){
        super(nome, idade, salario);
        this.linguagem = linguagem;
    }
    
    @Override
        void exibirInformacoes(){
        System.out.println("----------- SISTEMA DE FUNCIONÁRIOS (DEV)---------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Linguagem de Programação: " + linguagem);
    }
}
