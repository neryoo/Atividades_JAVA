/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.ex15.model;

/**
 *
 * @author sabri
 */
public class Endereco {
    
    private String rua;
    private String bairro;
    private String cep;
    
    public Endereco(String rua, String bairro, String cep){
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
    }
    
    public String getRua(){
        return rua;
    }
    
    public void setRua(String rua){
        this.rua = rua;
    }
    
    public String getBairro(){
        return bairro;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public String getCep(){
        return cep;
    }
    
    public void setCep(String cep){
        if(cep.matches("\\d{8}")){
            System.out.println("CEP: " + cep);
        }else{
            System.out.println("O CEP digitado não é válido pois não possui a quantidade de caracteres necessários");
        }
    }
    
    
}
