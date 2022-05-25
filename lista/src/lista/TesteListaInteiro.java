package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteListaInteiro {

    public static void main(String[] args) {
        ArrayList<Integer> listInteiro = new ArrayList();

        // criando listas da forma correta sempre definir um tipo string, int etc
        listInteiro.add(1);
        listInteiro.add(2);
        listInteiro.add(3);
        listInteiro.add(4);
        listInteiro.add(5);

        Scanner ent = new Scanner(System.in);
        Integer num, contPar = 0, contImpar = 0;

        for (int i = 0; i < listInteiro.size(); i++) {
            System.out.println("Digite o " + i + "º número");
            num = ent.nextInt();
            //PAR
            if (i % 2 == 0) {
                contPar++;

            }

            //IMPAR
            if (i % 2 == 1) {
                contImpar++;

            }
        }

        //soma
        int soma = 0;

        for (int i = 0; i < listInteiro.size(); i++) {
            soma += listInteiro.get(i);
            //IMPRIMINDO NA TELA 
            System.out.println("A soma dos números são:" + soma);

        }

        //MENOR E MAIOR NÚMERO 
        int maior = 0, menor = 0;

        for (int i = 0; i < listInteiro.size(); i++) {

            if (listInteiro.get(i) > maior) {
                maior = listInteiro.get(i);
            }

            if (listInteiro.get(i) < menor) {
                menor = listInteiro.get(i);

            }
        }

        //Exiba somente os pares da lista.
        System.out.println("Os números impares são:\n" + contPar);

        // Exiba somente os ímpares da lista.
        System.out.println("Os números pares são:\n" + contImpar);

        //Exiba a soma de todos os números da lista.
        System.out.println("Soma dos números são:\n " + soma);

        //Exiba somente o menor número da lista.
        System.out.println("Menor número é:\n" + menor);

        //Exiba somente o maior número da lista.
        System.out.println("Maior número é:\n " + maior);
    }

}
