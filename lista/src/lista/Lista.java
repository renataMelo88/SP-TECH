
package lista;


public class Lista {

   private String fruta;
   
   //contrutor

    public Lista(String fruta) {
        this.fruta = fruta;
    }
   
    //metodo de acesso

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }
    
    //tostring

    @Override
    public String toString() {
        return "Lista{" + "fruta=" + fruta + '}';
    }
    
    
}
