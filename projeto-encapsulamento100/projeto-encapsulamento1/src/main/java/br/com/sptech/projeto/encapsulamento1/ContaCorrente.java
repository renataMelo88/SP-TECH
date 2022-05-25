
package br.com.sptech.projeto.encapsulamento1;


public class ContaCorrente {
    private String nomeTitular;
    private Double saldo;
    
    //gerar get set + contrutor (alt insert)
    
    // depois jfarme for 

    public ContaCorrente(String nomeTitular, Double saldo) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public void saque(Double saque) {
        saldo -= saque;

    }

    public void deposito(Double deposito) {
        saldo += deposito;

    }
    
    
    
   
    
    
    
}
