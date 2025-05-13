/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.teste;

import br.edu.etec.model.RegiaoBrasil_ex04;
import br.edu.etec.model.Pessoa_ex04;

public class Atividade_enum_ex_04 {
    public static void main(String[] args) {
       Pessoa_ex04 pessoa1 = new Pessoa_ex04(RegiaoBrasil_ex04.NORTE);
       
       pessoa1.exibirRegiao();
       
       pessoa1.mudarRegiao(RegiaoBrasil_ex04.SUDESTE);
       
       pessoa1.mudarRegiao(RegiaoBrasil_ex04.NORDESTE);
   }
    }
