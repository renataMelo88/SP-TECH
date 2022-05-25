package br.com.sptech.projeto.encapsulamento1;

public class Planejamento {

    //ATRIBUTOS PRIVADOS
    private String responsalvel;
    private String atividade;
    private Integer diasEstimados;
    private Integer diasUsados = 0;

    // GERAR CONSTRUTOR ABAIXO
    public Planejamento(String responsalvel, String atividade, Integer diasEstimados) {
        this.responsalvel = responsalvel;
        this.atividade = atividade;
        this.diasEstimados = diasEstimados;

    }

    //GERAR GET AND SET (METODOS)
    public String getResponsalvel() {
        return responsalvel;
    }

    public void setResponsalvel(String responsalvel) {
        this.responsalvel = responsalvel;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public Integer getDiasEstimados() {
        return diasEstimados;
    }

    public void setDiasEstimados(Integer diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

    public Integer getDiasUsados() {
        return diasUsados;
    }

    public void setDiasUsados(Integer diasUsados) {
        this.diasUsados = diasUsados;

    }

    public void terminarAtividade(Integer diasUsados) {

        this.diasUsados = diasUsados;

    }

    public String calcularTempo() {

        Integer resultado = this.diasUsados - diasEstimados;

        if (this.diasUsados > diasEstimados) {

            return String.format("Você estimou %d dias, mas a tarefa\n"
                    + "foi feita em d% dias (%d dias a mais que o estimado). Melhore a estimativa",
                    diasEstimados, diasUsados, diasUsados - diasEstimados);
        } else if (this.diasUsados < diasEstimados) {
            return String.format("Você\n"
                    + "estimou %d dias, e a tarefa foi feita em %d dias (%d dias a menos que o estimado).\n"
                    + "Parabéns!",
                    diasEstimados, diasUsados, diasEstimados - diasUsados);

        } else {

            return String.format("Você\n"
                    + "estimou %d dias, e a tarefa foi feita em %D dias, atendendo a estimativa com precisão",
                    diasEstimados, diasUsados);

        }

    }

    // TO STRING
    @Override
    public String toString() {
        return "Planejamento{" + "responsalvel=" + responsalvel + ", atividade=" + atividade + ", diasEstimados=" + diasEstimados + ", diasUsados=" + diasUsados + '}';
    }

}
