/*

* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

*/

package br.edu.etec.exercicio1.teste;

import br.edu.etec.exercicico1.model.Pessoa;

/**

*

* @author Admin

*/

public class Exercicico1 {

    public static void main(String[] args){

   Pessoa p1 = new Pessoa(); 

   Pessoa p2 = new Pessoa();

   Pessoa p3 = new Pessoa();

        System.out.println("--------------GERENCIANDO ALUNOS--------------");

        ///////P1

        p1.setNome("Sabrina");

        p1.setIdade(23);

        p1.setCpf("123.654.789-12");

        System.out.println("NOME: " + p1.getNome());

        System.out.println("IDADE: " + p1.getIdade());

        System.out.println("CPF: " + p1.getCpf());

        System.out.println("------------------------------------------------");

        p2.setNome("Clara");

        p2.setIdade(17);

        p2.setCpf("321.456.987-34");

        System.out.println("NOME: " + p2.getNome());

        System.out.println("IDADE: " + p2.getIdade());

        System.out.println("CPF: " + p2.getCpf());

         System.out.println("------------------------------------------------");

        p3.setNome("Enzo");

        p3.setIdade(18);

        p3.setCpf("213.465.978-78");

        System.out.println("NOME: " + p3.getNome());

        System.out.println("IDADE: " + p3.getIdade());

        System.out.println("CPF: " + p3.getCpf());

 
    

    }

}

 
 