package br.com.sptech.projeto.poo1;

public class AppMetro {
    public static void main(String[] args) {
        BilheteUnico bilhete1 = new  BilheteUnico();
        bilhete1.saldo = 0.0;
        bilhete1.carregar(10.0);
        bilhete1.usar();
        
        System.out.println(bilhete1.saldo);
    }
}
