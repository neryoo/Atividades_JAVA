/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.ex2.TesteReservas;

/**
 *
 * @author sabri
 */

import br.edu.etec.ex2.exceptions.ClasseInvalidaException;
import br.edu.etec.ex2.exceptions.ValorPassagemInvalidoException;
import br.edu.etec.ex2.model.Passagem;
import br.edu.etec.ex2.model.PassagemEconomica;
import br.edu.etec.ex2.model.PassagemExecutiva;
import br.edu.etec.ex2.model.PassagemPrime;

public class Recuperacao_ex02 {

    public static void main(String[] args) {
        Passagem[] reservas = new Passagem[4]; // Vetor para armazenar as passagens

        // --- Instanciando Passagens Válidas ---
        System.out.println("--- Criando Passagens Válidas ---");
        try {
            reservas[0] = new PassagemEconomica("Ana Silva", "São Paulo", 350.00, true);
            reservas[1] = new PassagemExecutiva("Carlos Mendes", "Rio de Janeiro", 1200.00, 2);
            reservas[2] = new PassagemPrime("Beatriz Costa", "Nova Iorque", 5000.00, "Atendimento VIP com champanhe");
        } catch (ValorPassagemInvalidoException e) {
            System.err.println("Erro ao criar passagem válida: " + e.getMessage());
        }

        // --- Instanciando Passagem Inválida para Testar Exceção ---
        System.out.println("\n--- Tentando criar Passagem com Valor Inválido ---");
        try {
            reservas[3] = new PassagemEconomica("João Pereira", "Curitiba", 99.99, false); // Valor abaixo de R$100,00
        } catch (ValorPassagemInvalidoException e) {
            System.err.println("ERRO: " + e.getMessage());
            System.out.println("A passagem para " + e.getMessage().substring(e.getMessage().indexOf("R$")) + " não pôde ser criada.\n");
        }

        System.out.println("=".repeat(50));

        // --- Percorrendo o vetor e mostrando detalhes (Polimorfismo) ---
        System.out.println("--- Detalhes de Todas as Reservas ---");
        for (Passagem p : reservas) {
            if (p != null) { // Verifica se a posição não é nula (caso alguma criação tenha falhado)
                p.mostrarDetalhes();
            }
        }
    }
    }

