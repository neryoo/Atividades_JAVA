/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade_java_heranca_ex2;

/**
 *
 * @author sabri
 */
public class Aluno extends Pessoa{
    int ra;
    String curso;
    
    public Aluno(String nome, String cpf, String dtNascimento, int ra, String curso){
        super(nome, cpf, dtNascimento);
        this.ra = ra;
        this.curso = curso;
    }
    
        void aluno(){
        System.out.println("------------CADASTRO ESCOLA ALUNO------------");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de nascimento: " + dtNascimento);
        System.out.println("RA: " + ra);
        System.out.println("Curso: " + curso);
        
    }
    
}
