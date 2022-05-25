package pet.shop.adsb;

public class Pet {

    // - = PRIVATE 
    private String nome;
    private String raca;
    private Integer qtdaVisitas;
    private Double valorTotalGasto;

    // construtor
    public Pet(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
        this.qtdaVisitas = 0;
        this.valorTotalGasto = 0.0;
    }

    // criar get e set 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getQtdaVisitas() {
        return qtdaVisitas;
    }

    public void setQtdaVisitas(Integer qtdaVisitas) {
        this.qtdaVisitas = qtdaVisitas;
    }

    public Double getValorTotalGasto() {
        return valorTotalGasto;
    }

    public void setValorTotalGasto(Double valorTotalGasto) {
        this.valorTotalGasto = valorTotalGasto;
    }

    // toString
    @Override
    public String toString() {
        return String.format("Nome: %s"
                + "\nRaça: %s"
                + "\n Quantidade de visitas: %d"
                + "\nValor total:%.2f"
                +"\n*-------*---------*",
                nome,
                raca, 
                qtdaVisitas, 
                valorTotalGasto);
                
                
    }

}
