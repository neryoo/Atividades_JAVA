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

public class ex8 {
    public static void main(String[] args) {
        Double tempStr = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura (cº): "));
        JOptionPane.showMessageDialog(null, "A temperatura informada de " + tempStr + " em Fahrenheit é de " + tempStr * 1.8 + 32);
    }
  
}


//Solicite a temperatura em Celsius e converta para 
//Fahrenheit usando a fórmula: F = C * 1.8 + 32.