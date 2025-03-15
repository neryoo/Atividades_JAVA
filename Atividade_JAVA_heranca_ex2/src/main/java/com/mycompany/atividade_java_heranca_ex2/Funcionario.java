/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_java_heranca_ex2;

/**
 *
 * @author sabri
 */
public class Funcionario extends Pessoa {
    String cargo;
    int rgm;
    
    public Funcionario(String nome, String cpf, String dtNascimento, String cargo, int rgm){
        super(nome, cpf, dtNascimento);
        this.cargo = cargo;
        this.rgm = rgm;
    }
    
        void funcionario(){
        System.out.println("------------CADASTRO ESCOLA FUNCIONARIO------------");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de nascimento: " + dtNascimento);
        System.out.println("Cargo: " + cargo);
        System.out.println("RGM: " + rgm);
        
    }
}
