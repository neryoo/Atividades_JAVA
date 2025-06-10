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

public class ex5 {
    public static void main(String[] args) {
    int n1Str = Integer.parseInt(JOptionPane.showInputDialog("Informe a primeira nota do aluno: "));
    int n2Str = Integer.parseInt(JOptionPane.showInputDialog("Informe a segunda nota do aluno: "));
    int n3Str = Integer.parseInt(JOptionPane.showInputDialog("Informe a terceira nota do aluno: "));
    
    JOptionPane.showMessageDialog(null, "Nota 1: " + n1Str + "\n Nota 2: " 
            + n2Str + "s\n Nota 3: " + n3Str + "\n Média: " + (n1Str + n3Str + n3Str)/3);
    
       
    }
}


//Solicite três notas e calcule a média aritmética, 
//exibindo o resultado ao final.