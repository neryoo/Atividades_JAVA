/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_de_funcionario;

/**
 *
 * @author sabri
 */
public class Sistema_de_funcionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("", 18, 1412.00);
        f1.setNome("Enzo");
        f1.exibirInformacoes();
        
        Gerencia g1 = new Gerencia("", 45, 5315.00, "Gerencia");
        g1.setNome("Marcos");
        g1.exibirInformacoes();
        
        Dev d1 = new Dev("", 23, 4112.00, "Python");
        d1.setNome("Sabrina");
        d1.exibirInformacoes();
    }
}
