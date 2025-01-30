import java.util.Random;

public class Prodotto {
    
    public int code;

    public String name;

    public String description;

    public int price;

    public int iva;


   
    public int code(int randomNumber){
        Random number = new Random();
        return number.nextInt(randomNumber);
    }

    public int price(int value){
         return value;
    }

    public int iva(int price){
        int result = price -((price * 22)/100);
        return result;
    }

   public String completeName(String name, int code){
         this.name = name;
         this.code = code;
         String result = name + code;
         return result;
   }
 
    }

