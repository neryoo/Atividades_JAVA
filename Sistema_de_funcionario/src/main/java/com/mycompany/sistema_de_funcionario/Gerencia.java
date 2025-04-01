/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_funcionario;

/**
 *
 * @author sabri
 */
public class Gerencia extends Funcionario{
    String dpto;
    
    public Gerencia(String nome, int idade, double salario, String dpto){
        super(nome, idade, salario);
        this.dpto = dpto;
    }
    
  @Override
    void exibirInformacoes(){
        System.out.println("----------- SISTEMA DE FUNCIONÁRIOS (GERENTE) ---------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Departamento: " + dpto);
    }
        
}
