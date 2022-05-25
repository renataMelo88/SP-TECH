package com.mycompany.nivelamento;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        Double primeiroNumero = leitor.nextDouble();

        System.out.println("Digite o segundo numero");
        Double segundoNumero = leitor.nextDouble();

        Double soma = primeiroNumero + segundoNumero ;
        Double subtracao = primeiroNumero - segundoNumero;
        Double multiplicacao = primeiroNumero * segundoNumero;
        Double divisao = primeiroNumero / segundoNumero;
        
        System.out.println(String.format("Resultado da soma: %.2f",soma));
        System.out.println(String.format("Resultado da subtração: %.2f",subtracao));
        System.out.println(String.format("Resultado da multiplicação: %.2f",multiplicacao));
        System.out.println(String.format("Resultado da divisão: %.2f",divisao));
        
    }
}
