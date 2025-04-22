/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.ex14.model;

/**
 *
 * @author sabri
 */
public class Info extends Empresa {
    
    public Info(String teste){
        super(teste);
    }
    
   @Override
    public void exibirInfo(){
        System.out.println("Teste realizado");
    }
    
    private void gerarRelatorio(){
        System.out.println("Teste private realizado");
    }
    
}
