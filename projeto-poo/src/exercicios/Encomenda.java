package exercicios;

public class Encomenda {

    //atributos 
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Integer distancia = 00;
    Double valorEncomenda = 0.00;
   Double resultadoTotalP = 0.00;  

    //metodos
    void tamanho() {
        if (tamanho == "p") {
            Double tamanhoP = valorEncomenda * 0.1;
            Double resultadoTotalP = valorEncomenda + tamanhoP;

        }

        if (tamanho == "m") {
            Double tamanhoM = valorEncomenda * 0.3;
            Double resultadoTotalM = valorEncomenda + tamanhoM;
        }

        if (tamanho == "g") {
            Double tamanhoG = valorEncomenda * 0.5;
            Double resultadoTotalG = valorEncomenda + tamanhoG;
        }

    }

    void distancia() {
        if (distancia == 50) {
            valorEncomenda = 3.00;

        }
        if (distancia >= 51 && distancia <= 200) {
            valorEncomenda = 5.00;

        }
        if (distancia >= 201) {
            valorEncomenda = 7.00;

        }
    }

}
