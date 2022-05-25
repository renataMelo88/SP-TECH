
package com.mycompany.projeto.lista;


public class Animacao {
    
    //ATRIBUTOS PRIVADOS 
    private String nome;
    private Integer anoDeLancamento;
    
    // GET AND SET

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(Integer anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    
    //CONSTRUTOR

    public Animacao(String nome, Integer anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    
    //Criar toString
    @Override
    public String toString() {
        return "Animacao{" + "nome=" + nome + ", anoDeLancamento=" + anoDeLancamento + '}';
    }
    
    
    
    
    
    
    
}
