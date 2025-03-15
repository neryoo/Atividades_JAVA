/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_java_heranca_ex1;

/**
 *
 * @author Admin
 */
public class Atividade_JAVA_heranca_ex1 {

    public static void main(String[] args) {
       Veiculo carro1 = new Veiculo("Fiat","Fastback", 2022);
       
       carro1.informacoes();
       
       Carro carro2 = new Carro("Hyundai", "Tucson",2004, "Gasolina/Álcool");
       carro2.combustivel();
       
       CarroEletrico carro3 = new CarroEletrico("Audi", "Audi Q6", 2024,"Elétrico", "94,9 kWh");
       carro3.eletrico();
    }
    
}
