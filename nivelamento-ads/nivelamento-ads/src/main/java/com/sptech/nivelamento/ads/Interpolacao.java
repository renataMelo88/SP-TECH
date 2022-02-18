package com.sptech.nivelamento.ads;

public class Interpolacao {

    public static void main(String[] args) {
        String nome = "Maria";
        Integer idade = 30;
        Double altura = 1.55;
        Integer quantidadePets = 3;

        //Apresentação
        System.out.println("Meu nome é " + nome
                + " tenho " + idade + "anos de idade " + " e " + altura
                + " de altura.");

        //Interpolação
        String frase = String.format("Meu nome é %s, tenho %d anos, e %.1f de altura e %d gatos.",
                nome, idade, altura, quantidadePets);

        System.out.println(frase);
    }
}
