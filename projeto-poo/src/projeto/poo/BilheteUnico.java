
package projeto.poo;



public class BilheteUnico {

    //Atributos = caracteristicas
    String nome;
    Double saldo = 0.0;

    //Métodos = comportamentos
    void usar() {
        saldo -= 4.40;
    }

    void carregar(Double valorCarregar) {
        //this.saldo +=saldo;
        saldo += valorCarregar;
    }

    
    
    //upgrade que retorna saldo depois de carregar
//    Double carregar(Double valorCarregar){
//        //carreguei
//        saldo += valorCarregar;
//        //devolvo o valor atual do saldo
//        return saldo;
//    }
    
    // o que foi pedido
//    //upgrade verificando se é estudante
//    void usar(Boolean estudante) {
//        if (estudante) {
//            saldo -= 2.20;
//        } else {
//            saldo -= 4.40;
//        }
//    }
}
