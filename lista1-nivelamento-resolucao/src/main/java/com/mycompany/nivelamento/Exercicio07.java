package com.mycompany.nivelamento;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o limite de peso do elevador");
        Double limitePesoElevador = leitor.nextDouble();

        System.out.println("Digite o limite de pessoas");
        Integer limitePessoas = leitor.nextInt();

        System.out.println("Digite o peso da 1° pessoa");
        Double primeiraPessoa = leitor.nextDouble();

        System.out.println("Digite o peso da 2° pessoa");
        Double segundaPessoa = leitor.nextDouble();

        System.out.println("Digite o peso da 3° pessoa");
        Double terceiraPessoa = leitor.nextDouble();

        Double pesoTotal = primeiraPessoa + segundaPessoa + terceiraPessoa;

        System.out.println(String.format("Entraram 3 pessoas no elevador, no qual cabem %d pessoas. O peso total no elevador é de %.2f, sendo que ele suporta %.2f", limitePessoas, pesoTotal, limitePesoElevador));
    }
}
