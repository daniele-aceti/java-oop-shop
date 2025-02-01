import java.util.Random;

public class Prodotto {
    
    public int code;

    public String name;

    public String description;

    public double price;

    public double iva;

    public Prodotto(String name, double price, double iva){
        calcolaCodice();
        this.name = name;
        this.price = price;
        this.iva = iva;
    }

   
    public void calcolaCodice(){
        Random number = new Random();
        this.code = number.nextInt(1000, 100000);
    }

   public double getPrezzoBase(){
    return this.price;
   }

   public double getPrezzoiva(){
    return this.price  * this.iva;
   }

   public String getNomeEsteso(){
     return this.code + "-" + this.name;
   }
 
    }

