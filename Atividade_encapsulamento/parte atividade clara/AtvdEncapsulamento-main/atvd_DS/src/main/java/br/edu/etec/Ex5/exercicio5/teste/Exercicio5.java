/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio5.teste;

import br.edu.etec.exercicio5.model.Relogio;

/**
 *
 * @author CLARA
 */
public class Exercicio5 {
    public static void main (String[] arg){
        Relogio r1 = new Relogio();
       Relogio r2 = new Relogio();
        Relogio r3 = new Relogio();
        
        System.out.println("-------------- RELÓGIOS -------------------------");
        r1.setMinuto(30);
        r2.setMinuto(70);
        r3.setMinuto(50);
        System.out.println("MINUTOS: " + r1.getMinuto());
        System.out.println("MINUTOS: " + r2.getMinuto());
        System.out.println("MINUTOS: " + r3.getMinuto());

    }}
