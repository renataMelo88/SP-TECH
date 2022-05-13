package projeto.poo;

public class ContaCorrenteTeste {

    public static void main(String[] args) {

        //OBJETO
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();

        conta1.depositar(1500.00);
        conta2.sacar(80.00);

        conta1.titular = "Renata";
        //conta1.saldo = 0.0;

        conta2.titular = "Rafael";
        //conta2.saldo = 10.0;

        System.out.println(String.format("Titular: %s \n Saldo: R$%.2f", conta1.titular, conta1.saldo));
        System.out.println(String.format("Titular: %s \n Saldo: R$%.2f", conta2.titular, conta2.saldo));

        //Classe= forma 
        //Objeto= bolo
    }

}

