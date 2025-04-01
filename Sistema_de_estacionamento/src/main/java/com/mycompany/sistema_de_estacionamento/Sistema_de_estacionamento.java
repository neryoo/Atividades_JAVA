/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_de_estacionamento;

/**
 *
 * @author sabri
 */
public class Sistema_de_estacionamento {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Hyundai HB20", "OWM5414", 2005);
        v1.exibirInformacoes();
        
        Carro c1 = new Carro("Ford Fiesta", "OTB0071", 2010, 4);
        c1.exibirInformacoes();
        
        Moto m1 = new Moto("Honda Scooter", "GTA0656", 2020, 123);
        m1.exibirInformacoes();
    }
}
