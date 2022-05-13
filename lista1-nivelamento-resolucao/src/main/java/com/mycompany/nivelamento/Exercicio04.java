
package com.mycompany.nivelamento;

import java.util.Scanner;


public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
                    
        System.out.println("Qual é o valor únitario do produto");
        Double unitario = leitor.nextDouble();
        
        System.out.println("Qual a quantidade vendida");
        Integer quantidadeVendida = leitor.nextInt();
        
        System.out.println("Valor pago pelo cliente");
        Double valorPago = leitor.nextDouble();
        
        Double valorTotal = quantidadeVendida * unitario;
        
        Double troco = valorPago - valorTotal;
        
        
        System.out.println(String.format("Seu troco será de R$ %.2f, onde ",troco ));
    }
}
