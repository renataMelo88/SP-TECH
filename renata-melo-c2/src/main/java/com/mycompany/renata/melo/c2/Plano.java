
package com.mycompany.renata.melo.c2;


public class Plano {
    
     //Atributos:
    private Integer id;
    private String nomePlano;
    private Integer quantidadeDisponivel;
    private Double valorVenda;

    Plano(int i, String claro, int i0, double d) {
        
    }
    
       //METODOS DE ACESSO
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public Integer getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

 
    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    //CONSTRUTOR
    public Plano(Integer id, String nomePlano) {
        this.id = id;
        this.nomePlano = nomePlano;
        this.quantidadeDisponivel = 0;
        this.valorVenda = 0.00;
    }
     
    //TOSTRING
    @Override
    public String toString() {
        return String.format("ID:%d \n"
                + "Nome: %s \n"
                + "Quantidade disponível: %d \n"
                + "Valor R$ %.2f \n",
                id,
                nomePlano,
                quantidadeDisponivel,
                valorVenda);
    }

    
}
