/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.teste;

//import java.util.Scanner;
import br.edu.etec.model.DiaSemana_ex01;

public class Atividade_enum_ex_01 {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        
        int NumDia;
        
        
        System.out.println("Esolha um numero de 1 a 7 para identificar o dia da semana: ");
        
        if(scanner.hasNextInt()){
            NumDia = scanner.nextInt();
            
            
           
         switch(NumDia){
             case 1:
           }
        }
        */
        
       int num = 3;
       
       if(num >= 1 && num <= 7){
           DiaSemana_ex01 dia = DiaSemana_ex01.values()[num-1];
           System.out.println("O dia da semana selecionado é: " + dia);
       }else{
           System.out.println("Número Inválido");
       }
        
        }
    }

