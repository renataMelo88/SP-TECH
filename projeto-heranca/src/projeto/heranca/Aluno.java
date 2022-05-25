package projeto.heranca;

public class Aluno {

    //ATRIBUTOS
    private Integer ra;
    protected String nome;

    //Contructor
    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    //metodos de acesso
    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void teste() {
        System.out.println("1");
    }

}
