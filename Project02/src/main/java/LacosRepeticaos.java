
import java.util.Scanner;


public class LacosRepeticaos {
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("Numero; %d",i));
            
        }
        
        System.out.println("Exemplo 03 - While");
        
        Scanner leitor = new Scanner(System.in);
        Integer numeroDigitado = leitor.nextInt();
                
        while (numeroDigitado != 42) { 
            System.out.println("Errou(... tente novamente)");
            numeroDigitado = leitor.nextInt();
            
        }
        
        
    }
    
}
