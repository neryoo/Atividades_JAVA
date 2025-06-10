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

public class ex4 {
    public static void main(String[] args) {
        int n1Str = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        if(n1Str % 2 == 1){
            JOptionPane.showMessageDialog(null, "O número " + n1Str + " é um número ímpar");
        }else{
            JOptionPane.showMessageDialog(null, "O número " + n1Str + " é um número par");
    }
}
}


//Peça um número e use if para verificar se ele é par ou ímpar, 
//exibindo a mensagem correspondente.