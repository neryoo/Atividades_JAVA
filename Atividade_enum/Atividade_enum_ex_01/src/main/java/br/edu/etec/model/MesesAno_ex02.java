/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.model;

/**
 *
 * @author sabri
 */
public enum MesesAno_ex02 {
    JANEIRO(1), 
    FEVEREIRO(2), 
    MARCO(3), 
    ABRIL(4), 
    MAIO(5), 
    JUNHO(6), 
    JULHO(7), 
    AGOSTO(8), 
    SETEMBRO(9), 
    OUTUBRO(10),
    NOVEMBRO(11), 
    DEZEMBRO(12);
    
      private final int numero;

    MesesAno_ex02(int numero) {
            this.numero = numero;
        }

    public int getNumero() {
            return numero;
        }
}
