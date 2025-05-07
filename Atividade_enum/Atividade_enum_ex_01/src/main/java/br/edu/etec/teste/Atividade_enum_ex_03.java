/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.teste;

import br.edu.etec.model.ClassificacaoProduto_ex03;
        
public class Atividade_enum_ex_03 {
    public static void main(String[] args) {
        for(ClassificacaoProduto_ex03 produto: ClassificacaoProduto_ex03.values()){
            System.out.println(produto + "-" + produto.getDescricao());
        }
    }
}
