
package lista;

public class ListaInteiro {
    //ATRIBUTOS PRIVADOS 
    private Integer numero;
    
    //CONSTRUTOR

    public ListaInteiro(Integer numero) {
        this.numero = numero;
    }
    
    //METODO DE ACESSO

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    //TOSTRING

    @Override
    public String toString() {
        return "ListaInteiro{" + "numero=" + numero + '}';
    }
    
    
}
