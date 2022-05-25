package com.bandtec.heranca.aluno;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(123, "José");
        AlunoGraduacao a2 = new AlunoGraduacao(10.0, 10.0, 234, "Maria");
        
        System.out.println(a1);
        System.out.println(a2);
    }
}
