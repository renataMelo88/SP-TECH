package br.com.sptech.projeto.encapsulamento1;

public class RecursosHumanos {

    //ATRIBUTOS PRIVADOS
    private Integer totalReajuste;
    private Integer totalPromovidos;

    // GERAR CONSTRUTOR ABAIXO
    //começa com 0 reajuste
    public RecursosHumanos() {
        this.totalReajuste = 0;
        this.totalPromovidos = 0;
    }

    //metodos para reajuste (void pq não retona)
    public void reajustarSalario(Colaborador colab3, Double valorReajuste) {
        Double novoSalario = colab3.getSalario() + valorReajuste;
        colab3.setSalario(valorReajuste);
        totalReajuste++;
    }

    public void promoverColaboradoR(Colaborador colab3, String novoCargo, Double novoSalario) {
        colab3.setCargo(novoCargo);
        colab3.setSalario(novoSalario);
        totalPromovidos++;
        
        if (colab3.getSalario() < novoSalario) {
            colab3.setCargo(novoCargo);
            colab3.setSalario(novoSalario);
            totalPromovidos++;
            
        }else{
            System.out.println("Não promova pagando menos");
        }

    }

    // GERAR GET E SET JÁ QUE OS ATRIBUTOS SÃO PRIVADOS
    public Integer getTotalReajuste() {
        return totalReajuste;
    }

    public void setTotalReajuste(Integer totalReajuste) {
        this.totalReajuste = totalReajuste;
    }

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public void setTotalPromovidos(Integer totalPromovidos) {
        this.totalPromovidos = totalPromovidos;
    }
    
    
    // TOSTRING (alt insert)
    @Override
    public String toString() {
        return "RecursosHumanos{" + "totalReajuste=" + totalReajuste + ", totalPromovidos=" + totalPromovidos + '}';
    }
    
    

}
