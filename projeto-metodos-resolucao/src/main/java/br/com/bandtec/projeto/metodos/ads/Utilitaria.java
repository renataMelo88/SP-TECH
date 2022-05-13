
package br.com.bandtec.projeto.metodos.ads;

public class Utilitaria {
    /*
        
        "Javascripto" :
    
        function exibirLinha(){
            ...
        }
    
    */
    
    /* Assinatura do método
        
        modificador de acesso: delimita quem pode acessar o 
        método.
        
        Tipo de retorno: identifica o que o método devolve
        (se devolve).
        
        Nome do método: identificador, ex: exibirLinha
    */
    void exibirNomeDecorado(String x){
        exibirLinha();
        exibirNome(x);
        exibirLinha();
    }
    
    void exibirLinha(){
        System.out.println("------------------------------");
    }
    
    void exibirNome(String nome){
        System.out.println(String.format(
                "Nome: %s", nome));
    }
    
    
}
