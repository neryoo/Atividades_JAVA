/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio2.model;

/**
 *
 * @author CLARA
 */
public class Pessoa {
    private String nome; 
    private int idade; 
    private String cpf;

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        
        return idade;
    }

   
    public void setIdade(int idade) {
        if(idade < 0 ){
            System.out.println("Sua idade não é válida");
        }else{
        this.idade = idade;
        }   }

   
    public String getCpf() {
        return cpf;
    }

   
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
 
}
