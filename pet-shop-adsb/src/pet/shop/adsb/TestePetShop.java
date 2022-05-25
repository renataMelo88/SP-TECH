package pet.shop.adsb;

public class TestePetShop {

    public static void main(String[] args) {
        Pet pet1 = new Pet("Billy", "Salsicha");
        Pet pet2 = new Pet("Tôtó", "Caramelo");
        Pet pet3 = new Pet("Toninho", "Frajola");
        
        //OBJETO
        PetShop petshop = new PetShop("Pata de anjo");

        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(pet3);

        //chamar metodo
        petshop.darBanho(pet1, 100.00);
        petshop.darBanho(pet1, 50.00);

        System.out.println(pet1);

        petshop.darBanho(pet2, 100.00);
        petshop.darBanho(pet2, 100.00);
        petshop.darBanho(pet2, 100.0,10);

        System.out.println(pet2);

        System.out.println(petshop);

    }

}
