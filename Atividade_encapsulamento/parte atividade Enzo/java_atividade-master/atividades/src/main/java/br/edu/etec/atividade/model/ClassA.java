
package br.edu.etec.atividade.model;

public class ClassA {
   int numero;
public ClassA(int numero){
this.numero = numero;
} 

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
         System.out.println("numero " + numero);
    }

}
