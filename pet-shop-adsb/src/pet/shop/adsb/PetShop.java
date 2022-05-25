
package pet.shop.adsb;


public class PetShop {
       //ATRIBUROS
    private String nome;
    private Double valorFaturado;
    
    // construtor 

    public PetShop(String nome) {
        this.nome = nome;
        this.valorFaturado = 0.00;
    }
    
    public void darBanho(Pet petInformado, Double valorInformado){
        //soma o valor do banho no faturamento
        valorFaturado += valorInformado;
        
        //somando uma visita para o pet que tomou banho
        petInformado.setQtdaVisitas(petInformado.getQtdaVisitas()+1);
        
        Double valorgasto = petInformado.getValorTotalGasto();
        petInformado.setValorTotalGasto(valorgasto + valorInformado);
        
      
    }
    
    public void darBanho(Pet petInformado, Double valorInformado, Integer descontoInformado){
     //Porcentagem 32% de 150 (32/100)*150 
     
     Double valorDesconto = (valorInformado /100)* descontoInformado;
     Double valorPago = valorInformado - valorDesconto;
     
     valorFaturado += valorPago;
     
     petInformado.setQtdaVisitas(petInformado.getQtdaVisitas()+1);
     petInformado.setValorTotalGasto(petInformado.getValorTotalGasto() + valorPago);
     
     
    }
    
    // gerar get and set 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorFaturado() {
        return valorFaturado;
    }

    public void setValorFaturado(Double valorFaturado) {
        this.valorFaturado = valorFaturado;
    }
    
    
    //toString

    @Override
    public String toString() {
        return String.format("Relatório de vendas :\n"
                + "Nome do PetShop: %s \n"
                + "Valor total faturamento: %.2f",
                nome,
                valorFaturado);
    }
    
    
}


//ORDEM BOA PRÁTICAS E FORMATAR TOSTRING COMO A ACIMA 
//1atributos
//2contrutor 
//3meusMetodos
//3get and set 
//4toString
    

