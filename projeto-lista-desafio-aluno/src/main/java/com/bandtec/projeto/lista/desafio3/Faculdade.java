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
    public void matricularAluno(Aluno a1) {

        //Boolean existeAluno = existsAlunoPorNome(a1.getNome()); 
        //if (existeAluno == false) {
        //    alunos.add(a1);
        //}
        if (existsAlunoPorNome(a1.getNome()) == false) {
            alunos.add(a1);
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
       // for (int i = 0; i < alunos.size(); i++) {
            
       // }
       
       return null;
    }

    /*
        Deve retornar a quantidade de alunos matriculados (contidos na lista)
        que estão no semestre informado;
     */
    public Integer getQuantidadeAlunosPorSemestre(Integer semestre) {
        return null;
    }

    /*
        Deve retornar a quantidade de alunos com matricula cancelada (contidos na lista);
     */
    public Integer getQuantidadeAlunosComMatriculaCancelada() {
        return null;
    }

    public String getNome() {
        return null;
    }
}
