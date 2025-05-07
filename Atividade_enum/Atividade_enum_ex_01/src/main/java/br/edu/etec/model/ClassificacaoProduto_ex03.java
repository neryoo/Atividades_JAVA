/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.model;

/**
 *
 * @author sabri
 */
public enum ClassificacaoProduto_ex03 {
    BASICO("Produto simples"), PADRAO("Produto padrao"), PREMIUM("Produto de alto nivel");
    
    private final String descricao;
    
    ClassificacaoProduto_ex03(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
}
