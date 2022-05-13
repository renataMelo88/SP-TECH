package com.bandtec.lista.nivelamento.resolucao;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ex06Sorteio {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número (entre 1 à 100):");
        Integer numeroDigitado = leitor.nextInt();

        while (numeroDigitado < 0 || numeroDigitado > 100) {
            System.out.println("Digite um valor válido(entre 1 à 100)");
            numeroDigitado = leitor.nextInt();
        }

        Integer numeroGerado;
        Integer rodada = 0;
        Integer pares = 0;
        Integer impares = 0;

        Boolean encontrou = false;
        
        System.out.println("\nSorteios\n");

        for (Integer i = 1; i <= 200; i++) {

            numeroGerado = ThreadLocalRandom.current().nextInt(0, 101);

            System.out.println(String.format("%dº rodada: %d", i, numeroGerado));

            if (numeroGerado % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (numeroGerado.equals(numeroDigitado) && !encontrou) {
                rodada = i;
                encontrou = true;
            }

        }
        
        System.out.println(String.format("\nO número foi encontrado? %s \npares: %d \nimpares: %d \n"
                + "rodada: %d", (encontrou ? "SIM" : "NÃO"), pares, impares, rodada));
    }
}
