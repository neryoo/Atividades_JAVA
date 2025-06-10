/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.atividade.joption;

/**
 *
 * @author sabri
 */

import javax.swing.JOptionPane;

public class ex9 {
    public static void main(String[] args) {
      int n1Str = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
      
      if(n1Str >= 10 && n1Str <= 20){
          JOptionPane.showMessageDialog(null, "O número " + n1Str + " esta entre o intervalo dos números 10 e 20");
      }else{
          JOptionPane.showMessageDialog(null, "O número " + n1Str + " não esta entre o intervalo dos números 10 e 20");
      }
    }
}


//Peça um número e verifique se ele está entre 10 e 20 (inclusive). Exiba 
//uma mensagem caso ele esteja dentro ou fora do intervalo usando if (num >= 10 && num <= 20).