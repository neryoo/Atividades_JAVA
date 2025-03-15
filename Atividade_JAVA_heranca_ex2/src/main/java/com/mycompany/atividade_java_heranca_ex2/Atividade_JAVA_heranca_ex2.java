/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_java_heranca_ex2;

/**
 *
 * @author sabri
 */
public class Atividade_JAVA_heranca_ex2 {

    public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("Sabrina", "123.456.789-12", "04/10/2001");
    pessoa1.pessoa();
    System.out.println(" ");
    
    Aluno aluno1 = new Aluno("Sabrina", "123.456.789-12", "04/10/2001", 731, "Desenvolvimento de Sistemas");
    aluno1.aluno();
    System.out.println(" ");
    
    Professor prof1 = new Professor("Paloma", "123.456.789-12", "15/11/2000", "Tecnologia", 1234);
    prof1.professor();
    System.out.println(" ");
    
    Funcionario func1 = new Funcionario("Rebeca", "123.456.789-12", "10/10/1998", "Limpeza", 456);
    func1.funcionario();
    System.out.println(" ");
       
    }
}
