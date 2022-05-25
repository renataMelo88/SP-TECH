
package com.mycompany.nivelamento;

import java.util.Scanner;


public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
                    
        System.out.println("Quanto filhos de 0 a 3 você possui");
        Integer quantidadeDeFilhos = leitor.nextInt();
        
        System.out.println("Quanto filhos de 4 a 16 você possui");
        Integer quantidadeDeFilhos2 = leitor.nextInt();
        
        System.out.println("Quanto filhos de 17 a 18 você possui");
        Integer quantidadeDeFilhos3 = leitor.nextInt();
        
        Double quantidade1 = quantidadeDeFilhos*25.12;
        Double quantidade2 = quantidadeDeFilhos2*15.88;
        Double quantidade3 = quantidadeDeFilhos3*12.44 ;
        
        
        Double valorBolsa = quantidade1+quantidade2+quantidade3;
        
      
        
        System.out.println(String.format("Valor da bolsa: %.2f", valorBolsa));
        
       
        
    }
 
}
