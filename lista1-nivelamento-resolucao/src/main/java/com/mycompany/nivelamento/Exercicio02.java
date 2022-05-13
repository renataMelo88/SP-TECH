package com.mycompany.nivelamento;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu login");
        String login = leitor.next();

        System.out.println("Digite sua senha");
        String senha = leitor.next();

        System.out.println("Digite a quantidade de erros de login e senha antes do bloqueio");
        Integer quantidadeDeErros = leitor.nextInt();

        System.out.println(String.format("Seu login é %s e sua senha é %s.Você tem %d tentativas antes de ser bloqueado",
                 login, senha, quantidadeDeErros));
    }
}
