package com.mycompany.nivelamento;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu salário");
        Double salario = leitor.nextDouble();

        System.out.println("Digite o valor que você gasta de condução, somente o valor de ida");
        Double valeTransporte = leitor.nextDouble();

        Double descontoinss = salario * 0.1;
        Double descontoIR = salario * 0.2;
        Double descontoVT = valeTransporte * 2 * 22;

        Double totalDesconto = descontoinss + descontoIR + descontoVT;

        Double salarioLiquido = salario - descontoinss - descontoIR - descontoVT;

        System.out.println(String.format("Seu salário bruto é R$%.2f, tem um total de R$%.2f em descontos e receberá um líquido de R$%.2f", salario, totalDesconto, salarioLiquido));
    }
}
