/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.etec.ex1.testePedidos;

/**
 *
 * @author sabri
 */
import br.edu.etec.ex1.exceptions.PrecoInvalidoException;
import br.edu.etec.ex1.exceptions.QuantidadeInvalidaException;
import br.edu.etec.ex1.model.Eletronico;
import br.edu.etec.ex1.model.Livro;
import br.edu.etec.ex1.model.Pedido;
import br.edu.etec.ex1.model.Produto;
import br.edu.etec.ex1.model.Roupa;

public class Recuperacao_ex01 {

    public static void main(String[] args) {
        Produto[] produtos = new Produto[3];
        
            Livro livro = new Livro("Coraline", 55.90, 10, "Neil Gaiman");
            Eletronico eletronico = new Eletronico("Smartphone X", 1200.00, 5, 12);
            Roupa roupa = new Roupa("Camiseta Arcane/Jinx", -5, 20, "M");

            produtos[0] = livro;
            produtos[1] = eletronico;
            produtos[2] = roupa;
            
             for (Produto p : produtos) {
                if (p != null) {
                    p.exibirDetalhes();
                    System.out.println();
                }
            }
    }
}
