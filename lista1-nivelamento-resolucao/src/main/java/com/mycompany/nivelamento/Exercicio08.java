package com.mycompany.nivelamento;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome");
        String nome = leitor.next();

        System.out.println("Digite a primeira nota");
        Double primeiraNota = leitor.nextDouble();

        System.out.println("Digite a segunda nota ");
        Double segundaNota = leitor.nextDouble();
        
        Double media =  (primeiraNota +  segundaNota)/ 2;
        
        System.out.println(String.format("Olá, %s. Sua média foi de %.2f",nome,media));
    }
}
