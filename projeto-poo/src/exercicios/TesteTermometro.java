package exercicios;

public class TesteTermometro {

    public static void main(String[] args) {
        //INSTANCIA A CLASSE
        Termometro temp1 = new Termometro();

        temp1.aumentaTemperatura(Double.MAX_VALUE);
        temp1.diminuiTemperatura(Double.MIN_VALUE);
        temp1.exibeFahreinheit(Double.MAX_VALUE);

        System.out.println(String.format("Temperatura atual: %f \n Temperatura máxima %f \n, "
                + "Temperatura miníma %f", temp1.temperaturaMax, temp1.temperaturaMin, temp1.resultadoConversao));

    }

}
