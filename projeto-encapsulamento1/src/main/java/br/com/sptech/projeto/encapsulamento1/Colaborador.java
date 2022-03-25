package br.com.sptech.projeto.encapsulamento1;

public class Colaborador {

    private String nomeColaborador;
    private String cargo;
    private Double salario;

    public Colaborador(String nomeColaborador, String cargo, Double salario) {
        this.nomeColaborador = nomeColaborador;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Colaborador(String nomeColaborador, String cargo) {
        this.nomeColaborador = nomeColaborador;
        this.cargo = cargo;
        this.salario = 0.00;
    }

    public String getNomeColaborador() {
        return nomeColaborador;
    }

    public void setNomeColaborador(String nomeColaborador) {
        this.nomeColaborador = nomeColaborador;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    //alt + insert (to.String)
    @Override
    public String toString() {
        return "Colaborador{" + "nomeColaborador=" + nomeColaborador + ", cargo=" + cargo + ", salario=" + salario + '}';
    }

}
