
package com.sptech.nivelamento.ads;

import java.util.Scanner;


public class Leitura {
    
    public static void main(String[] args) {
        
        // Este é um exemplo de objeto ou
        // Instância da classe Scanner
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumeros = new Scanner(System.in);
        
        System.out.println("Digite sua idade:");
        Integer idadeDigitada = leitorNumeros.nextInt();
        
        System.out.println("Digite seu nome: ");
        String nomeDigitado = leitorTexto.nextLine();
        
        System.out.println("Olá, " + nomeDigitado);
        
        System.out.println("Sua idade: " + idadeDigitada);
        
        System.out.println("Digite sua altura:");
        Double altura = leitorNumeros.nextDouble();
        
        System.out.println("A altura digitada foi: " + altura);
        
    }
}