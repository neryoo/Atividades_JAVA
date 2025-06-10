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

public class ex7 {
    public static void main(String[] args) {
       double pesoStr = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso: "));
       double alturaStr = Double.parseDouble(JOptionPane.showInputDialog("Informe o sua altura: "));
       
       JOptionPane.showMessageDialog(null, "Peso: " + pesoStr + "\nAltura: " + alturaStr + "\n IMC: " + pesoStr /(alturaStr*alturaStr));
    }
}


//Receba o peso (kg) e altura (m), calcule o IMC 
//com a fórmula peso / (altura * altura) e exiba o valor com duas casas decimais.