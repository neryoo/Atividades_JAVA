/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.ex11.model;

/**
 *
 * @author sabri
 */
public class Aluno {
    private String nome;
    private double n1;
    private double n2;
    
    public Aluno(String nome, double n1, double n2){
        this.nome = nome;
        this.n1= n1;
        this.n2 = n2;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    
    public double getN1(){
        return n1;
    }
    
   //EXERCICIO 12 COM VALIDAÇÃO DE NOTA 
    
    public void setN1(double n1){
        if(n1 <= 10){
        this.n1 = n1;
        }else{
            System.out.println("Nota 1:  inválida. Por favor insira uma nota entre 0 e 10.");
        }
    }
    
    public double getN2(){
        return n2;
    }
   
    
    public void setN2(double n2){
        if(n2 <= 10){
        this.n2 = n2;
        }else{
            System.out.println("Nota 2:  inválida. Por favor insira uma nota entre 0 e 10.");
        }
    }
    
    
    public double calcularMedia(){
        return((n1 + n2) / 2);
    }
    
    public void estaAprovado(){
        if(calcularMedia() >= 6){
            
            System.out.println("Média: " + calcularMedia());
            System.out.println("Status: Aprovado");
        }else{
            System.out.println("Média: " + calcularMedia());
            System.out.println("Status: Reprovado");
        }
    }   
}