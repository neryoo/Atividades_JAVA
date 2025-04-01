/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_formas_geometricas;

/**
 *
 * @author sabri
 */
public class Sistema_formas_geometricas {

    public static void main(String[] args) {
        Circulo forma1 = new Circulo("Círculo", 10);
        forma1.exibirInformacoes();
        
        Retangulo forma2 = new Retangulo("Retângulo", 10, 10);
        forma2.exibirInformacoes();
        
        Quadrado forma3 = new Quadrado("Quadrado", 0, 0, 15);
        forma3.exibirInformacoes();
    }
}
