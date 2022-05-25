
package com.mycompany.renata.melo.c2;


public class Operadora {
     //ATRIBUTOS 
    private String nome;
    private Integer quantidadePlanosVendidos;
    private Integer quantidadeDescontosAplicados;

    //CONSTRUTOR

    public Operadora(String nome, Integer quantidadePlanosVendidos, Integer quantidadeDescontosAplicados) {
        this.nome = nome;
        this.quantidadePlanosVendidos = quantidadePlanosVendidos;
        this.quantidadeDescontosAplicados = quantidadeDescontosAplicados;
    }

    //METODO DE ACESSO
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadePlanosVendidos() {
        return quantidadePlanosVendidos;
    }

    public void setQuantidadePlanosVendidos(Integer quantidadePlanosVendidos) {
        this.quantidadePlanosVendidos = quantidadePlanosVendidos;
    }

    public Integer getQuantidadeDescontosAplicados() {
        return quantidadeDescontosAplicados;
    }

    public void setQuantidadeDescontosAplicados(Integer quantidadeDescontosAplicados) {
        this.quantidadeDescontosAplicados = quantidadeDescontosAplicados;
    }
    
    

    //METODOS REALIZAR VENDA 
    public void realizarVenda(Plano nomePlano, Double valorVenda,Integer valorBonus) {
        
        if (plano.getQuantidadeDisponivel() >0) {
            plano.setQuantidadeDisponivel()(plano.getQuantidadeDisponivel() -1);
            
            quantidadePlanosVendidos +=1;
            quantidadeDescontosAplicados+=1;
           
            
             //SOBRECARGA 
       Double vendaComDesconto = (valorBonus / 100.0) * valorVenda;
            

        } else {
            System.out.println(String.format("Realizando venda com desconto:"
                    + "\nID:%d"
                    + "\nNome: %s"
                    + "\nQuantidade disponível: %d"
                    + "\nValor R$ %.2f",
                    plano.getId(),
                    plano.getNomeplano(),
                    plano.getquantidadeDisponivel(),
                    valorVenda,
                    vendaComDesconto));
        }


       
        
        
    }

    public void cadastrarQuantidadeDisponivel(Plano nomePlano, Plano quantidadeDisponivel) {

        String.format("A quantidade disponível do plano %s foi aumentada",
                nome);
    }
    
   
    //TOSTRING
    @Override
    public String toString() {
        return String.format("Nome:%s \n"
                + "Quantidade de vendas: %d \n"
                + "Desconto: %d",
                nome,
                quantidadePlanosVendidos,
                quantidadeDescontosAplicados);
    }
    
}
