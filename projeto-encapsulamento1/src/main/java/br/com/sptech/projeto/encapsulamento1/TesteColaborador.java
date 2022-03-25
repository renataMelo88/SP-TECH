package br.com.sptech.projeto.encapsulamento1;

public class testeColaborador {

    public static void main(String[] args) {
        Colaborador colab1 = new Colaborador("Renata", "Analista", 10000.00);
        Colaborador colab2 = new Colaborador("julio", "Dev");
        
        RecursosHumanos rh = new RecursosHumanos();

        /*exibindo colab1
        System.out.println(colab1.getNomeColaborador());
        System.out.println(colab1.getCargo());
        System.out.println(colab1.getSalario());

        exibindo colab2
        System.out.println(colab2.getNomeColaborador());
        System.out.println(colab2.getCargo());
        System.out.println(colab2.getSalario());*/
        
        
        System.out.println(colab1.toString());
        System.out.println(colab2.toString());
        
        rh.promoverColaboradoR(colab2, "estagiário", 1700.00);
        System.out.println(colab2.toString());
        
        
        
        

    }

}
