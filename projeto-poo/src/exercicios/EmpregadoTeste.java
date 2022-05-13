package exercicios;

public class EmpregadoTeste {

    public static void main(String[] args) {
        //INSTANCIA A CLASSE
        Empregado empregado = new Empregado();

        empregado.nome = "João";
        empregado.cargo = "Analista de Sistemas";
        empregado.salario = 5400.00;

        Double valorSalarioAtualizado = empregado.salario * 0.15;

        System.out.println(String.format("Nome: %s \n Cargo: %s \n Salário atualozado: R$%.2f",
                empregado.nome, empregado.cargo, valorSalarioAtualizado));
    }
}
