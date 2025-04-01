/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_funcionario;

/**
 *
 * @author sabri
 */
public class Funcionario {
    private String nome;
    int idade;
    double salario;
    
    public Funcionario(String nome, int idade, double salario){
        this.idade = idade;
        this.salario = salario;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    void exibirInformacoes(){
        System.out.println("----------- SISTEMA DE FUNCIONÁRIOS ---------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
    }
}
