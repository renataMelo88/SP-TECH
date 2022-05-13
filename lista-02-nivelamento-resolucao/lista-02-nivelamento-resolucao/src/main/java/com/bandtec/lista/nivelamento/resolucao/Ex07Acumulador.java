package com.bandtec.lista.nivelamento.resolucao;

import java.util.Scanner;

public class Ex07Acumulador {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Integer valorDigitado;
        Integer total = 0;

        do {

            System.out.println("Digite um número:");
            valorDigitado = leitor.nextInt();

            total += valorDigitado;

        } while (!(valorDigitado.equals(0)));

        System.out.println(String.format("Total acumulado: %d", total));
    }
}
