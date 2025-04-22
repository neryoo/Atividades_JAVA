
package br.edu.etec.atividade.model;

public class Funcionario {
    private double salario;
    private String cargo;
    public Funcionario(String cargo, double salario){
    this.cargo = cargo;
    this.salario = salario;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
        if (this.salario >= 1412.00){
        System.out.println("salario" + salario);
        }else{
        System.out.println("Não posso liberar salario: ");
        }
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
        System.out.println("Cargo: " + cargo);
    }
}
