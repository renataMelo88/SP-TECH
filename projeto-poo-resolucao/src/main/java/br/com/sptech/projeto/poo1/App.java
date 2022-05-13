package br.com.sptech.projeto.poo1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();
        
        Scanner leitor = new Scanner(System.in);

        conta1.nome = "Diego";
        conta1.saldo = 0.0;

        conta2.nome = "Huk";
        conta2.saldo = 1000.0;
        
        System.out.println("Deposite na conta 1:");
        Double valorDigitado = leitor.nextDouble();
        
        conta1.depositar(valorDigitado);
        
        System.out.println(
                String.format("Nome: %s, saldo: %.2f", conta1.nome, conta1.saldo));
        System.out.println(
                String.format("Nome: %s, saldo: %.2f", conta2.nome, conta2.saldo));
    }
}
