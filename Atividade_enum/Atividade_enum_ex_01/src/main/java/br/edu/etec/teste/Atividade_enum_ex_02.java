/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.teste;

import br.edu.etec.model.MesesAno_ex02;

import java.util.Scanner;

public class Atividade_enum_ex_02 {
    public static void main(String[] args) {
       int num = 3;
       
       if(num >= 1 && num <= 12){
           MesesAno_ex02 mes = MesesAno_ex02.values()[num-1];
           System.out.println("O Mes selecionado é: " + mes);
       }else{
           System.out.println("Número Inválido");
       }
    }
}
