/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio5.model;

/**
 *
 * @author CLARA
 */
public class Relogio {
    private int minuto; 

    
    public int getMinuto() {
        return minuto;
    }

    
    public void setMinuto(int minuto) {
        if(minuto >= 0 && minuto < 60){
       this.minuto = minuto;
        }else{
         System.out.println("os minutos estão inválidos");
        
        }
    }
    
}
