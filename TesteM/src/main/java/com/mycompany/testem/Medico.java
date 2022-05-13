
package com.mycompany.testem;


public class Medico {
    
    //ATRIBUTOS
    private Integer id;
    private String nome;
    private String especialidade;
    private Boolean ativo;
    private Double salario;
    
    
    
    //CONSTRUTOR 

    public Medico(Integer id, String nome, String especialidade, Boolean ativo, Integer bonus, Double valorFaturado) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.ativo = true;
        this.salario = 0.00;
        
    }
   
    
   
    

    //SOBRECARGA
    public void realizarPagamento(Medico salario,Double bonus,Double salarioInformado, 
            Double valorFaturado,Integer descontoInformado) {
        //Porcentagem 32% de 150 (32/100)*150 
        //CALCULO PORCENTAGEM
        
        Double valorSalarioComBonus = (salarioInformado/ 100) * descontoInformado;
        Double valorPago = salarioInformado + valorSalarioComBonus;
        
        valorFaturado += valorPago;
        
        
         String.format("Realizando pagamento com bônus \n"
                + "Valor do pagamento R$%.2f \n"
                + "Valor do bônus  R$%.2f \n"
                + "ID:%d \n"
                + "Ativo: \n"
                + "Nome:%s \n"
                + "Especialidade:%s \n"
                + "Salario:R$%.2f \n"
                + "Valor a receber R$%.2f \n",
                valorPago,id,nome,especialidade,ativo,salario, valorFaturado);
        

    }
    
    
   //METODO DE ACESSO (GET AND SET)
  

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

      //TOSTRING

    @Override
    public String toString() {
        return "Medico{" + "id=" + id + ", nome=" + nome + ", especialidade=" + especialidade + ", ativo=" + ativo + ", salario=" + salario + '}';
    }
    
    
    
    
}
