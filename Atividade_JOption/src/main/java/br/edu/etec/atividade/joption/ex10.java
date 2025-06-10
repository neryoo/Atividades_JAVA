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

public class ex10 {
    public static void main(String[] args) {
        int idadeStr = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
        String nacionalidade = JOptionPane.showInputDialog("Infore sua Nacionalidade: ");
        
        if(idadeStr >= 16){
            JOptionPane.showMessageDialog(null,"Nacionalidade: " + nacionalidade + "\nIdade: " + idadeStr + "\n Status: Apto a votar");
        }else{
            JOptionPane.showMessageDialog(null,"Nacionalidade: " + nacionalidade + "\nIdade: " + idadeStr + "\n Status: Não Apto a votar");
        }
    }
}


//Peça a idade e a nacionalidade (como texto). 
//Verifique se a pessoa tem 16 anos ou mais e se é brasileira (&&). Mostre se ela pode votar ou não.
