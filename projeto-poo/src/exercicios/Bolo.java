package exercicios;

public class Bolo {

    // Atributos  (caracteristicas)
    String sabor;
    Double valor = 0.0;
    Integer quantidadeVendida = 0;

    //METODOS
    void sabor() {
    }

    void valor() {
        if (valor >= 30.00 && valor <= 50.00) {

        }
    }

    void quantidadeVendida(Integer quantidadeComprada) {
        if (quantidadeVendida + quantidadeComprada > 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo!");

        } else {
            quantidadeVendida += quantidadeComprada;
            System.out.println(String.format("O bolo sabor %s, foi comprado %f vezes hoje,"
                    + " totalizando R$ %f.2", sabor, quantidadeVendida));

        }

    }

}
