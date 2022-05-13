package br.com.bandtec.projeto.metodos.ads;

public class TesteCalculadora {

    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        
//        calc.somar(2, 2);
//        calc.somar(40, 2);

//        Integer resultadoCalculo = calc.somar(10, 10);
//        
//        System.out.println("Resultado: " + resultadoCalculo);
        
        System.out.println(String.format(
                "Resultado: %d", calc.somar(10, 10)));
        
        calc.somar(10, 10);
        
        Integer numeroPar = 2;
        Integer numeroImpar = 3;
        
        System.out.println(
                String.format("%d é par: %s",
                        numeroPar,
                        calc.isPar(numeroPar) ? "SIM" : "NÃO"));
        
        System.out.println(
                String.format("%d é par: %s",
                        numeroImpar,
                        calc.isPar(numeroImpar) ? "SIM" : "NÃO"));


                        //crtl+shift+s formata
        
    }
}
