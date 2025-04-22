/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.ex15.teste;

/**
 *
 * @author sabri
 */

import br.edu.etec.ex15.model.Endereco;

public class Atividade_encapsulamento_ex15 {

    public static void main(String[] args) {
       Endereco end1 = new Endereco("Rua", "Bairro", "");
       
       end1.setRua("Avenida águia de Haia");
       end1.setBairro("Parque Paineiras");
       end1.setCep("0819105");
       
        System.out.println("-------CADASTRO DE ENDEREÇO----------");
        System.out.println("Rua: " + end1.getRua());
        System.out.println("Bairro: " + end1.getBairro());
        System.out.println("CEP: " + end1.getCep());
    }
}
