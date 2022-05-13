
package projeto.poo;

public class ContaCorrente {
    
    //Declarando as caracteristicas da conta
    // Essas caracteristicas são atributos, caracteristicas da classe são atributos
    
    String titular;
    Double saldo;
    
    
    //Declarando os comportamentos 
    //METODOS
    void depositar(Double valorDeposito){
       
    saldo= + valorDeposito ;
    System.out.println("Depositou!");}
    
    void sacar(Double valorSaque){
    saldo= - valorSaque;
    System.out.println("Sacou!");}
    
    
    
}
