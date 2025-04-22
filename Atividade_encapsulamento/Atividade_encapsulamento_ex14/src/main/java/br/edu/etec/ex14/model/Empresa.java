/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.ex14.model;

/**
 *
 * @author sabri
 */
public class Empresa {
    
    String teste;
    
    public Empresa(String teste){
        this.teste = teste;
    }
    
    public void exibirInfo(){
        System.out.println("Método para exibir as informações");
    }
    
    private void gerarRelatorio(){
        System.out.println("Metodo para gerar o relatorio");
    }
}
