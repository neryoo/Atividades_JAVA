/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_java_heranca_ex2;

/**
 *
 * @author sabri
 */
public class Pessoa {
    String nome;
    String cpf;
    String dtNascimento;
    
    Pessoa(String nome, String cpf, String dtNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
    }
    
    void pessoa(){
        System.out.println("------------CADASTRO ESCOLA------------");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de nascimento: " + dtNascimento);
        
    }
}
