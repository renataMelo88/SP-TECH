package com.mycompany.projeto.lista;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        // var nomes = []; vetores
        // var args = [];
        // void não tem retorno
        // String [] name = new String[10];
        List listaEstranha = new ArrayList();

        /* metodo add permite adiconar novos elementos em uma lista
        listaEstranha.add("Matheus");
        listaEstranha.add(42);
        listaEstranha.add(10.0);
        listaEstranha.add(true);

        System.out.println(listaEstranha);*/
        // criando listas da forma correta sempre definir um tipo string, int etc
        List<String> names = new ArrayList();

        //add names 
        names.add("Renata");
        names.add("Pedro");
        names.add("Lucas");
        names.add("Bruno");

        // names.add(10); NÃO É STRING
        System.out.println(names);

        //names.length = names.size() RETORNA A QUANTIDADE DE ELEMENTOS)
        //get(i) deveolve o elemento contido no indice elevado
        System.out.println("PRIMEIRA EXIBIÇÃO!!!");
        for (int i = 0; i < names.size(); i++) {

            String nomeDaVez = names.get(i);

            System.out.println("Nome:" + nomeDaVez);

        }

        // O METODO ADD PODE SER USADO COMO INDICE
        names.add(0, "Pablo");

        System.out.println("-".repeat(15));
        System.out.println("Depois do add(0,Pablo)");

        for (int i = 0; i < names.size(); i++) {

            String nomeDaVez2 = names.get(i);

            System.out.println("Nome:" + nomeDaVez2);

        }

        //REMOVE O ELEMENTO ATUAL COLOCANDO UM NOVO
        names.set(1, "Brandão");
        System.out.println("-".repeat(15));
        System.out.println("Depois do set(0,Brandao)");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(String.format("Nome: %s", names.get(i)));
        }

        //REMOVE
        names.remove(0);

        System.out.println("-".repeat(15));
        System.out.println("Depois do remove(0)");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(String.format("Nome: %s", names.get(i)));

        }

        // ESTÁ VAZIO OU NÃO
        names.clear();
        if (names.isEmpty()) {
            System.out.println("Está vazio!");

        } else {
            System.out.println("Não está vazio!");

        }

        System.out.println("-".repeat(20));
        names.add("Renata");
        names.add("Pedro");
        names.add("Lucas");

        for (String name : names) { //for aprimorado
            System.out.println("Nome:" + name);

        }
        
        //LISTA INTEIRO
        List<Integer> numerosInteiros = new ArrayList<>();
        
         numerosInteiros.add(1);
         numerosInteiros.add(10);
         numerosInteiros.add(100);
         numerosInteiros.add(1000);
        
        
        for (Integer numeroInteiro : numerosInteiros) {
            System.out.println(numeroInteiro);
            
            
            
        }
        
        //----------Animacao.java---------------//
        
        Animacao a1 = new Animacao("Sherek", 2005);
        Animacao a2 = new Animacao("Toy Story", 2005);
        Animacao a3 = new Animacao("Carros", 2006);
        Animacao a4 = new Animacao("Rei Leão", 1994);
        Animacao a5 = new Animacao("Branca de Neve", 1600);
        Animacao a6 = new Animacao("Pica pau", 2000);
        
        
        //Adicionando as animacoes a lista
        List<Animacao> animacoes = new ArrayList<>();
        
        animacoes.add(a1);
        animacoes.add(a2);
        animacoes.add(a3);
        animacoes.add(a4);
        animacoes.add(a5);
        animacoes.add(a6);
        
        //Criar for para percorrer 
        for (Animacao animacaoDaVez : animacoes) {
            //Printa um ano específico
            if (animacaoDaVez.getAnoDeLancamento().equals(1994)) {
                System.out.println(animacaoDaVez);
                
                
            }
            
            //printar objeto da vez
            //System.out.println(animacaoDaVez.toString());
           // System.out.println(animacaoDaVez.toString());
            
        }
        

    }

}
