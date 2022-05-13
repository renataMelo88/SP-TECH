
package projeto.heranca;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

private String nome;    
private List<Aluno> aluno;


    // CONSTRUTOR DECLARANDO ARRAY LIST  
    public Faculdade(String nome) {
        this.nome = nome;
        this.aluno = new  ArrayList<>();
    }
    
    public void matricularAluno(Aluno aluno){
        this.aluno.add(aluno);
    }




}
