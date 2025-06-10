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

public class ex3 {
    public static void main(String[] args) {
        int n1Str = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro: "));
        int n2Str = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número inteiro: "));
        
        if(n1Str > n2Str){
            JOptionPane.showMessageDialog(null, "O número " + n1Str + " é maior que o número " + n2Str);
        }else if(n1Str < n2Str){
            JOptionPane.showMessageDialog(null, "O número " + n1Str + " é menor que o número " + n2Str);
        }else{
            JOptionPane.showMessageDialog(null, "Os números " + n1Str + " e " + n2Str + " são iguais");
        }
    }
}


//Peça dois números inteiros e informe qual é o maior, ou se são iguais.