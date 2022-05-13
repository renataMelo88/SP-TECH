
import com.github.javafaker.Faker;


public class App {
    public static void main(String[] args) {
        Faker faker = new Faker();
        
        System.out.println("Nome aleatório" +faker.name().fullName());
        
    }
    
}
