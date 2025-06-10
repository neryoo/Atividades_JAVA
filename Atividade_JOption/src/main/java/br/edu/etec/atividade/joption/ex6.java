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

public class ex6 {
    public static void main(String[] args) {
    int n1Str = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));    
    String op = JOptionPane.showInputDialog("Informe a operação (+, -, *, /): ");
    int n2Str = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
    
    if(op.equals("+")){
        JOptionPane.showMessageDialog(null, " A soma de" + n1Str + " + " + n2Str + " é: " + (n1Str + n2Str) );
    }else if(op.equals("-")){
        JOptionPane.showMessageDialog(null, " A subtração de" + n1Str + " - " + n2Str + " é: " + (n1Str - n2Str));
    }else if(op.equals("*")){
        JOptionPane.showMessageDialog(null, " A multiplicação de" + n1Str + " x " + n2Str + " é: " + n1Str * n2Str );
    }else if(op.equals("/")){
        JOptionPane.showMessageDialog(null, " A divisão de" + n1Str + " / " + n2Str + " é: " + n1Str / n2Str );
    }
    }
}


//Peça dois números e a operação desejada (+, -, *, /). 
//Faça o cálculo com base na operação escolhida e mostre o resultado.