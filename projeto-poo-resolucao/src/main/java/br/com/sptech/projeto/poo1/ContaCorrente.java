package br.com.sptech.projeto.poo1;

public class ContaCorrente {

    String nome;
    Double saldo = 10.0;

    void sacar(Double valorSaque) {
        if (valorSaque > saldo) {
            System.out.println("saldo insuficiente...");
        } else {
            saldo -= valorSaque;
            System.out.println("Sacou");
        }
    }

    void depositar(Double valorDeposito) {
        saldo += valorDeposito;
        System.out.println("Depositou!");
    }
}
