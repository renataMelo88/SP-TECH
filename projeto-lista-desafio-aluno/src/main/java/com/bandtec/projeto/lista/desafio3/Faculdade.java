package com.bandtec.projeto.lista.desafio3;

import java.util.List;

public class Faculdade {

    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
    }

    /*
        Deve verificar se existe um aluno com o nome informado, caso não exista,
        retorne false;
    */
    public Boolean existsAlunoPorNome(String nome) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getNome().equals(nome)) {
                return true;
                
            }
            
        }
        return false;
      
    }

    /*
        Deve matricular um aluno na faculdade (inserir na lista), se a lista já
        possuir um aluno com o nome informado, não deve matricular;
    */
    public void matricularAluno(Aluno alunoRenata) {
        if (existsAlunoPorNome(alunoRenata.getNome())) {
            alunos.add(alunoRenata);
        }
    }

    /*
        Deve cancelar a matricula de um aluno na faculdade (ativo = false), se não existir
        um aluno com o RA informado, não faça nada.
    */
    public void cancelarMatricula(String ra) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getRa().equals(ra)) {
                alunos.get(i).setAtivo(false);
                
            }
        }

    }

    /*
        Deve retornar a quantidade de alunos contidos na lista (matriculados);
    */
    public Integer getQuantidadeAlunos() {
       
        for (int i = 0; i < alunos.size(); i++) {
          
            
       }
       return alunos.size();
    }

    /*
        Deve retornar a quantidade de alunos matriculados (contidos na lista)
        que estão no semestre informado;
    */
    public Integer getQuantidadeAlunosPorSemestre(Integer semestre) {
        for (int i = 0; i < alunos.size(); i++) {
            if (semestre.equals(alunos.get(i).getSemestre())) {
               System.out.println(alunos.get(i)); 
                
            }
            
        }
        return semestre;
    }

    /*
        Deve retornar a quantidade de alunos com matricula cancelada (contidos na lista);
    */
    public Integer getQuantidadeAlunosComMatriculaCancelada() {
        Integer qtdaAlunosCancelados =0;
     
        
        for (int i = 0; i < alunos.size(); i++) {
            
                if (alunos.get(i).getAtivo().equals(false)) {
                    qtdaAlunosCancelados ++;
                    
                }
                
                 
                
            }
            
        return qtdaAlunosCancelados;
    }   

    public String getNome() {
        return null;
    }
}
