package com.sptech.nivelamento.ads;

public class PassagemMetro {
    public static void main(String[] args) {
        
        String usuario = "Maria";
        Double saldo = 250.5;
        
        Double vezes = (saldo / 4.40);
        
        // O valor da passagem é 4.40
        // Usamos o método .intValue para converter para inteiro
        System.out.println("Olá "+ usuario + ", você ainda pode usar o "
                + "metro " + vezes.intValue() + " vezes"); 
        
        //Agora com interpolação
        System.out.println(
                String.format("Olá %s, você ainda pode usar o metro %d", 
                        usuario, vezes.intValue()));
        
        Integer desconto = 50;
        System.out.println(String.format("Oi\\nVocê possui %d%% de desconto", desconto));               
        
    }
}
