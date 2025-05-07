/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.teste;

import br.edu.etec.model.MesesAno_ex02;

import java.util.Scanner;

public class Atividade_enum_ex_02 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
        System.out.println("Digite um número de 1 a 12 para saber a qual mes se refere: ");
        int numero = scanner.nextInt();
        
    if(numero >=1 && <=12){
        MesesAno_ex02 mes = MesesAno_ex02.values()[numero];
            System.out.println("Numero digitado: " + numero + 
                    "Estamos no mes: " + mes);
        }
            }
    }
