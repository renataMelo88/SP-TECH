package com.bandtec.lista.nivelamento.resolucao;

/**
 *
 * @author Diego Brito <diego.lima@bandtec.com.br | @Britooo on Github>
 */
public class Ex03NumerosPares {

    public static void main(String[] args) {

        for (Integer i = 0; i <= 40; i++) {

            if (i % 2 == 0) {
                System.out.println(String.format("-> %d", i));
            }

        }

        //outra solução (GAMBIARRA)
        //for (Integer i = 0; i < 10; i+=2) {
        //System.out.println(String.format("-> %d", i));
        //}
    }
}
