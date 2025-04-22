
package br.edu.etec.atividade.model;

public class ContaBancaria {
  private String numeroConta;
  private String titular;
  private double saldo;
  public ContaBancaria(String numeroConta, String titular, double saldo){
  this.numeroConta = numeroConta;
  this.saldo = saldo;
  this.titular = titular;
  }

    /**
     * @return the numeroConta
     */
    public String getNumeroConta() {
        return numeroConta;
    }

    /**
     * @param numeroConta the numeroConta to set
     */
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
        System.out.println("Numero da Conta: " + this.numeroConta);
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
        System.out.println("Titular: " + this.titular);
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
        System.out.println("Saldo: " + this.saldo);
    }
    public void sacar(double valor){
    if(valor <= this.saldo){
    System.out.println("sacar: " + valor);
    }else{
      System.out.println("Sem saque");   
    }
    
    }
    public void deposito(double valor){
    if(valor >= this.saldo){
    System.out.println("depositar: " + valor);
    }else{
    System.out.println("sem depositar");
    }
    }
}
