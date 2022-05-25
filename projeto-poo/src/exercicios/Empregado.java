package exercicios;

public class Empregado {

    // Atributos  (caracteristicas)
    String nome;
    String cargo;
    Double salario = 0.00;
    Double valorSalarioAtualizado = salario * 0.15;

    //Métodos = comportamentos
    void salario() {
        salario = valorSalarioAtualizado;
    }

}
