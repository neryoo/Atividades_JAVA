/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.ex11.teste;

/**
 *
 * @author sabri
 */

import br.edu.etec.ex11.model.Aluno;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(" ", 0, 0);
        a1.setNome("Sabrina");
        a1.setN1(10);
        a1.setN2(9);
    
        System.out.println("Aluno: " + a1.getNome());
        System.out.println("Nota 1: " + a1.getN1());
        System.out.println("Nota 2: " + a1.getN2());
        a1.estaAprovado();
    }
    
}
