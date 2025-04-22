/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.atividade.teste;

import br.edu.etec.atividade.model.ContaBancaria2;

/**
 *
 * @author enzoa
 */
public class atividade10 {
public static void main(String[] args){
ContaBancaria2 c1 = new ContaBancaria2("134" , "titulos" ,  2344 );
c1.setNumeroConta("134");
c1.setSaldo(2344);
c1.setTitular("titulos");
c1.sacar(3504);
c1.deposito(1203);
}    
}
