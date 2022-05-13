package com.bandtec.lista.nivelamento.resolucao;

import java.util.Scanner;

public class Ex08Votacao {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijos = 0;
        Integer voto;

        System.out.println("Votação que literalmente acaba em pizza");
        System.out.println("------------------------------------------");
        System.out.println("vote nas opções abaixo:");
        System.out.println("5 -> mussarela\t25 -> calabresa\t50 -> quatro queijos\n");

        for (Integer i = 1; i <= 10; i++) {

            System.out.println(String.format("Digite %dº voto:", i));
            voto = leitor.nextInt();

            switch (voto) {
                case 5:
                    mussarela++;
                    break;
                case 25:
                    calabresa++;
                    break;
                case 50:
                    quatroQueijos++;
                    break;
                default:
                    System.out.println("Voto inválido! digite algo como: 5");
                    i--;
            }
        }

        System.out.println("\nResultado da votação:\n");
        System.out.println(String.format("mussarela: %d\ncalabresa: %d\nquatro queijos: %d\n", mussarela, calabresa, quatroQueijos));

        if (mussarela > calabresa && mussarela > quatroQueijos) {
            System.out.println("Mussarela ganhou bambino!");
        } else if (calabresa > mussarela && calabresa > quatroQueijos) {
            System.out.println("Calabresa ganhou bambino!");
        } else if (quatroQueijos > mussarela && quatroQueijos > calabresa) {
            System.out.println("Quatro queijos ganhou bambino!");
        } else {
            System.out.println("Deu empate, uma nova votação deverá ser realizada!");
        }

    }
}
