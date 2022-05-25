package com.mycompany.nivelamento;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual é o seu nome");
        String nome = leitor.next();

        System.out.println("Digite em minutos (valor inteiro) que você passou se aquecendo");
        Integer tempo1 = leitor.nextInt();

        System.out.println("Digite em minutos (valor inteiro) que você passou se aeróbicos");
        Integer tempo2 = leitor.nextInt();

        System.out.println("Digite em minutos (valor inteiro) que você passou se musculação");
        Integer tempo3 = leitor.nextInt();

        Integer aquecendo = tempo1 * 12;
        Integer aeróbicos = tempo2 * 20;
        Integer musculacao = tempo3 * 25;

        Integer tempo = tempo1 + tempo2 + tempo3;

        Integer calorias = aquecendo + aeróbicos + musculacao;

        System.out.println(String.format("Olá, %s. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias", nome, tempo, calorias));

    }

}
