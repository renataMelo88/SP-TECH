
package com.mycompany.projeto.revisao.jdbc;


public class Jogo {
   private Integer id;
   private String nome;
   private String genero;

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Jogo{" + "id=" + id + ", nome=" + nome + ", genero=" + genero + '}';
    }
   
   
}
