package com.mycompany.nivelamento;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = leitor.next();

        System.out.println(String.format("Olá, %s! Qual o ano de seu nascimento?",nome));
        Integer anoNasc = leitor.nextInt();

        Integer idadeEm2030 = 2030 - anoNasc;
        
        System.out.println(String.format ("Em 2030 você terá %d anos", idadeEm2030));
    }
}
