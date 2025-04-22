
package br.edu.etec.atividade.teste;

import br.edu.etec.atividade.model.ContaBancaria;

public class atividade9 {
 public static void main(String[] args){
 ContaBancaria c1 = new ContaBancaria("189" , "titulo" ,  2039 );
 c1.setNumeroConta("189");
 c1.setSaldo(2039);
 c1.setTitular("titulo");
 c1.deposito(2020);
 c1.sacar(2302);
 
 }   
}
