package exercicios;

import java.util.Scanner;

public class BoloTeste {

    public static void main(String[] args) {
        Bolo boloChocolate = new Bolo();
        Bolo boloMorango = new Bolo();
        Bolo boloAbacaxi = new Bolo();

        boloChocolate.sabor = "Chocolate";
        boloMorango.sabor = "Morango";
        boloAbacaxi.sabor = "Abacaxi";

        boloChocolate.valor = 30.00;
        boloMorango.valor = 45.00;
        boloAbacaxi.valor = 50.00;

        Scanner leitor1 = new Scanner(System.in);
        Scanner leitor = new Scanner(System.in);
        String saborBolo;

        Integer quantidadeComprada;

        for (int i = 0; i < 5; i++) {

            System.out.println("Qual sabor de bolo?");
            saborBolo = leitor.nextLine();

            System.out.println("Qual a quantidade de bolo?");
            quantidadeComprada = leitor.nextInt();
            if (saborBolo.equals("morango")) {
                boloMorango.quantidadeVendida(quantidadeComprada);

            }

            if (saborBolo.equals("chocolate")) {
                boloChocolate.quantidadeVendida(quantidadeComprada);

            }

            if (saborBolo.equals("abacaxi")) {
                boloAbacaxi.quantidadeVendida(quantidadeComprada);
            }

        }

        System.out.println(String.format("Sabor do bolo comprado: %s \n Valor: R$%.2f \n",
                boloMorango.sabor, boloMorango.valor));

    }

}
