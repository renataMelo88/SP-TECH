package br.com.bandtec.projeto.metodos.ads;

public class Calculadora {

//    void somar(Integer numero1, Integer numero2){
//        System.out.println("Resultado: " + (numero1 + numero2));
//    }
    Integer somar(Integer numero1, Integer numero2) {
//        Integer resultado = numero1 + numero2;
//        return resultado;
        return numero1 + numero2;
    }

    Integer somar(Integer numero1, Integer numero2, Integer numero3) {
//        Integer resultado = numero1 + numero2;
//        return resultado;
        return numero1 + numero2 + numero3;
    }

    Double somar(Double numero1, Double numero2, Double numero3) {
//        Integer resultado = numero1 + numero2;
//        return resultado;
        return numero1 + numero2 + numero3;
    }
    
    Boolean isPar(Integer numero1){
        return numero1 % 2 == 0;
    }
}
