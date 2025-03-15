/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_java_heranca_ex2;

/**
 *
 * @author sabri
 */
public class Professor extends Pessoa{
    String disciplina;
    int rf;
    
    public Professor(String nome, String cpf, String dtNascimento, String disciplina, int rf){
        super(nome, cpf, dtNascimento);
        this.disciplina = disciplina;
        this.rf = rf;
    }
    
        void professor(){
        System.out.println("------------CADASTRO ESCOLA PROFESSOR------------");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de nascimento: " + dtNascimento);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("RF: " + rf);
    }
    
}
