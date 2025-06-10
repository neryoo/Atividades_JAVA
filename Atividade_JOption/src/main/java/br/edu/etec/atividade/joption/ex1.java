/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.atividade.joption;

/**
 *
 * @author sabri
 */

import javax.swing.JOptionPane;

public class ex1 {

    public static void main(String[] args) {
        int nStr = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        
        if(nStr > 0){
            JOptionPane.showMessageDialog(null, "O número informado é um número positivo");
        }else if (nStr < 0){
            JOptionPane.showMessageDialog(null, "O número informado é um número negativo");
        }else{
            JOptionPane.showMessageDialog(null, "O número informado é igual a zero");
        }
    }
}

//Peça um número ao usuário via JOptionPane e use if, else if, 
//e else para exibir se ele é positivo, negativo ou igual a zero.
