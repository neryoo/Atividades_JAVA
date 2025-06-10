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

public class ex2 {
    public static void main(String[] args) {
        int notaStr = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota do aluno: "));
        
        if(notaStr >= 7){
            JOptionPane.showMessageDialog(null, "Nota: " + notaStr + ".\nStatus: Aluno Aprovado");
        }else if(notaStr >= 5 && notaStr <= 6.9){
            JOptionPane.showMessageDialog(null, "Nota: " + notaStr + ".\nStatus: Aluno em Recuperação");
        }else{
            JOptionPane.showMessageDialog(null, "Nota: " + notaStr  + ".\nStatus: Aluno Reprovado");
        }
    }
    
}

//Receba a nota de um aluno e exiba se ele foi "Aprovado" (nota ≥ 7),
//"Em recuperação" (nota entre 5 e 6.9), ou "Reprovado" (nota < 5).