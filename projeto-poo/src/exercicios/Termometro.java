package exercicios;

public class Termometro {

    Double temperaturaAtual = 0.00;
    Double temperaturaMax = 40.00;
    Double temperaturaMin = 2.00;
    Double calculoFahreinheit = 1.8 + 32;
    Double resultadoConversao = 0.00;

    //metodos
    void aumentaTemperatura(Double novaTemperatura) {

        if (novaTemperatura > temperaturaAtual) {
            temperaturaAtual = 30.0;

        }
    }

    void diminuiTemperatura(Double novaTemperatura) {
        if (novaTemperatura > temperaturaAtual) {
            temperaturaAtual = temperaturaMin ;

        }
    }

    void exibeFahreinheit(Double novaTemperatura) {

        Double resultadoConversao = temperaturaAtual * calculoFahreinheit;

    }

}

    
  //formula Fahreinheit  °F = °C × 1, 8 + 32
