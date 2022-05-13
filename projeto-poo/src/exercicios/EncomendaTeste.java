package exercicios;

import java.util.Scanner;

public class EncomendaTeste {

    public static void main(String[] args) {
        //INSTANCIA A CLASSE
        Encomenda orcamento = new Encomenda();

        orcamento.enderecoRemetente = "Av Interlagos";
        orcamento.enderecoDestinatario = "Av Ibirapuera";

        orcamento.distancia = 100;
        orcamento.valorEncomenda = 50.90;

        orcamento.tamanho = "p";

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o tamanho da entrega?");
        orcamento.tamanho = leitor.nextLine();

        if (orcamento.tamanho == "p") {
            Double tamanhoP = orcamento.valorEncomenda * 0.1;
            Double resultadoTotalP = orcamento.valorEncomenda + tamanhoP;

            System.out.println(String.format("Endereço do remetente: %s  \n Endereço de destinatario %s \n"
                    + " Distancia %d  \n tamanho: %s \n Valor da encomenda:R$ \n"
                    + " Valor da total da encomenda: R$%.2f",
                    orcamento.enderecoRemetente,
                    orcamento.enderecoDestinatario, orcamento.distancia, orcamento.tamanho,
                    orcamento.valorEncomenda, resultadoTotalP));

        }

        if (orcamento.tamanho == "m") {
            Double tamanhoM = orcamento.valorEncomenda * 0.3;
            Double resultadoTotalM = orcamento.valorEncomenda + tamanhoM;
        }

        if (orcamento.tamanho == "g") {
            Double tamanhoG = orcamento.valorEncomenda * 0.5;
            Double resultadoTotalG = orcamento.valorEncomenda + tamanhoG;
        }

        if (orcamento.distancia == 50) {
            orcamento.valorEncomenda = 3.00;

        }
        if (orcamento.distancia >= 51 && orcamento.distancia <= 200) {
            orcamento.valorEncomenda = 5.00;

        }
        if (orcamento.distancia >= 201) {
            orcamento.valorEncomenda = 7.00;

        }

    }
}
