package projeto.heranca;

public class AlunoGraduacao extends Aluno {

    private Double notaContinuada;
    private Double notaintegrada;

    //contructor
    public AlunoGraduacao(Double notaContinuada, Double notaintegrada, Integer ra, String nome) {
        super(ra, nome);
        this.notaContinuada = notaContinuada;
        this.notaintegrada = notaintegrada;
    }

    @Override
    public void teste() {
        //chama o metodo da super classe -> super.teste(); 
        System.out.println("42");//sobrescrita
    }

    //metodos de acesso
    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public Double getNotaintegrada() {
        return notaintegrada;
    }

    public void setNotaintegrada(Double notaintegrada) {
        this.notaintegrada = notaintegrada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RA").append(this.getRa()); //Private acesso com metodo
        sb.append("Nome").append(nome); // Protected
        sb.append("AlunoGraduacao{");
        sb.append("notaContinuada=").append(notaContinuada);
        sb.append(", notaintegrada=").append(notaintegrada);
        sb.append('}');
        return sb.toString();
    }

}
