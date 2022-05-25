package com.mycompany.testem;

public class TreinadorMedico {

    //ATRIBUTOS
    private String nome;
    private Integer bonus;
    private Double valorFaturado;

    //CONSTRUTOR

    public TreinadorMedico(String nome, Integer bonus, Double valorFaturado) {
        this.nome = nome;
        this.bonus = bonus;
        this.valorFaturado = valorFaturado;
    }

   
    

    //SOBRECARGA
    public void realizarPagamento(Medico salario,Double bonus,Double salarioInformado, Integer descontoInformado) {
        //Porcentagem 32% de 150 (32/100)*150 
        //CALCULO PORCENTAGEM
        
        Double valorSalarioComBonus = (salarioInformado/ 100) * descontoInformado;
        Double valorPago = salarioInformado + valorSalarioComBonus;
        
        valorFaturado += valorPago;
       
        

    }
    
    //TOSTRING

    @Override
    public String toString() {
        return "TreinadorMedico{" + "bonus=" + bonus + ", valorFaturado=" + valorFaturado + '}';
    }
    
}
