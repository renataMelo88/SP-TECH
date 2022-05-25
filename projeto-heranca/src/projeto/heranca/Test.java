package projeto.heranca;

import java.util.ArrayList;
import java.util.List;

public class Test {             

    public static void main(String[] args) {
        AlunoGraduacao alunoGrad = new AlunoGraduacao(9.9, 9.5, 1, "Renata");
        AlunoGraduacao alunoGrad1 = new AlunoGraduacao(7.6, 7.2, 2, "karolina");

        Aluno aluno = new Aluno(1, "Raquel");
        Aluno aluno1 = new Aluno(2, "David");

        System.out.println(alunoGrad.getNotaContinuada());
        System.out.println(alunoGrad.getNotaintegrada());

        System.out.println(aluno.getRa());
        System.out.println(aluno.getNome());

        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getRa());

        alunoGrad.teste();

        // List<Aluno> alunos = new ArrayList();
        // alunos.add(aluno);
        // alunos.add(aluno1);
        if (alunoGrad1 instanceof AlunoGraduacao) { //o alunoGrad1 é aluno de graduação
            System.out.println("É aluno");

        }

        Aluno a3 = new AlunoGraduacao(10.0, 10.0, 1, "tESTE");

    }

}
