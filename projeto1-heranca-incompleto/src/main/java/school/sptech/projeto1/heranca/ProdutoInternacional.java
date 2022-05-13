package school.sptech.projeto1.heranca;

public class ProdutoInternacional extends Produto{

    public ProdutoInternacional(Integer id, String nome, String categoria, Double preco) {
        super(id, nome, categoria, preco);
    }
 
    /* 
        Essa classe deve ser herdeira de produto [x]
        O método "getPreco" (getter padrão) deverá ser sobreescrito 
        possuir um acréscimo de 
        60%;
    */   

    @Override
    public Double getPreco() {
        Double valor = super.getPreco();
        Double total = valor + valor * 0.6;
        return total;
    }      
   
}
