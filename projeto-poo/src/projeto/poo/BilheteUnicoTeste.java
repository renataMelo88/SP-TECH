package projeto.poo;

public class BilheteUnicoTeste {

    public static void main(String[] args) {
        //INSTANCIA A CLASSE
        BilheteUnico bilhete1 = new BilheteUnico();
        BilheteUnico bilhete2 = new BilheteUnico();
        
       
        bilhete1.carregar(100.00);
        bilhete1.usar();

        bilhete2.carregar(100.00);
        bilhete2.usar();

        bilhete1.nome = "Renata";
        bilhete2.nome = "Raquel";

        System.out.println(String.format("Nome: %s  \n Saldo: R$%.2f", bilhete1.nome,
                bilhete1.saldo));
       System.out.println(String.format("Nome: %s \n  Saldo: R$%.2f",bilhete2.nome,
               bilhete2.saldo));

    }

}

 /* segundo exemplo
public class AppMetro {
    public static void main(String[] args) {
        BilheteUnico bilhete1 = new  BilheteUnico();
        bilhete1.saldo = 0.0;
        bilhete1.carregar(10.0);
        bilhete1.usar();
        
        System.out.println(bilhete1.saldo);
    }
}
*/