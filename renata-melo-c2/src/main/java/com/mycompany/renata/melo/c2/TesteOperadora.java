
package com.mycompany.renata.melo.c2;

/**
 *
 * @author renata.melo
 */
public class TesteOperadora {
    
    public static void main(String[] args) {
        //Crie dois objetos do tipo Plano. 

        Plano plano1 = new Plano(1, " nomePlano", 10, 40.0);

        Plano plano2 = new Plano(2, "Claro", 10, 1000.00);

        //Crie um objeto do tipo  Operadora. 
        Operadora operadora = new Operadora("Vivo", 10, 10);

        //Exiba as informações dos planos. 
        System.out.println(plano1);
        System.out.println(plano2);

        //Cadastre a quantidade disponivel para os dois planos
        plano1.setQuantidadeDisponivel(10);
        plano2.setQuantidadeDisponivel(20);

        //Realize a venda do primeiro plano
        plano1.setValorVenda(100.00);
        //Realize a venda do segundo plano
        plano2.setValorVenda(99.99);

        //Exiba novamente as informações dos planos. 
        System.out.println(plano1);
        System.out.println(plano2);

        //Exiba novamente as informações dos planos. 
        System.out.println(plano1);
        System.out.println(plano2);

        //Exiba as informações da operadora 
        System.out.println(operadora);

    }

}
