package com.sptech.nivelamento.ads;

import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {

        //Digite um número e valide se é > ou < que 42
        Scanner leitor = new Scanner(System.in);

        Integer numero = 42;

        System.out.println("Digite um número:");
        Integer numeroDigitado = leitor.nextInt();

        // O IF é igual no JS!
        if (numero > numeroDigitado) {
            System.out.println("42 é maior que " + numeroDigitado);
        } else if (numero < numeroDigitado) {
            System.out.println("42 é menor que " + numeroDigitado);
        } else {
            System.out.println("Você digitou 42!!");
        }

        // Comparando Strings, no Java usamos .equals
        String nome1 = "matheus";
        String nome2 = "MATheus";

        // Sensitive case
        if (nome1.equals(nome2)) {
            System.out.println("Os nomes são iguais!!!");
        } else {
            System.out.println("Os nomes são diferentes!!!");
        }
        
        //INsensitive case
        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("É igual");
        } else {
            System.out.println("É diferente!");
        }
        
        //A comparação de booleanos é igual ao JS!
        Boolean ligado = true;

        if (ligado) {
            System.out.println("Ligado!");
        } else {
            System.out.println("Desligado!");
        }
    }
}
