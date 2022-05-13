package Ac1;

import java.util.Scanner;

public class Plano {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Scanner metaDeDesenvolvimento = new Scanner(System.in);

        System.out.println("Bem vindo gestor! Realize o controle das tarefas do time: \n"
                + "Quantidade de tarefas pendentes:");

        Integer quantidadeTarefasPendentes = entrada.nextInt();

        System.out.println("Meta de desenvolvimento (%):");

        Integer porcentagemMeta = metaDeDesenvolvimento.nextInt();
        Integer resultadoDasMetas = (porcentagemMeta * quantidadeTarefasPendentes) / 100;
        Integer tarefasAtuais = quantidadeTarefasPendentes - resultadoDasMetas;
        

        System.out.println(String.format("Para atingir a meta, o time precisa finalizar %d tarefas!", resultadoDasMetas));

        Scanner proximosPassos = new Scanner(System.in);
        String resposta = "";
        System.out.println("Escolha os próximos passos"
                + "\n  1 - Finalizar"
                + "\n  2 - Sair");
        Integer escolhaProximoPasso = proximosPassos.nextInt();

        switch (escolhaProximoPasso) {
            case 2:

                System.out.println("\n Até logo!");

                break;

            case 1:
                System.out.println("\n Digite a quantidade de tarefas realizadas!");
                quantidadeTarefasPendentes = entrada.nextInt();

                if (escolhaProximoPasso == 0) {
                    System.out.println("Número Inválido!");

                    while (escolhaProximoPasso == 0) {

                        System.out.println(String.format("O time possui uma quantidade menor de tarefas pendentes! \n"
                                + "Quantidade atual: %d"
                                + "\n Digite uma quantidade válida!", quantidadeTarefasPendentes));
                        Integer quantidadeTarefasPendente = entrada.nextInt();

                        System.out.println(String.format("\n Finalizando tarefas! %d", tarefasAtuais));
                        System.out.println("\n Digite a quantidade de tarefas realizadas!");
                        System.out.println(String.format("\n %d", tarefasAtuais));

                    }

                }
        }

    }
}
