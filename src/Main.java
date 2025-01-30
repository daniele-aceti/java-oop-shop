public class Main {

    public static void main(String[] args) {
        
        //codice random
        Prodotto codeProdotto = new Prodotto();
        int randomValue = codeProdotto.code(100);
        System.out.println(randomValue);


//prezzo base

    Prodotto prezzoProdotto = new Prodotto();
    int basicPrice = prezzoProdotto.price(100);
    System.out.println(basicPrice); 
    

    //iva
    Prodotto ivaPrice = new Prodotto();
    System.out.println( ivaPrice.iva(basicPrice));

    
    //nome completo 

    Prodotto nameProdotto = new Prodotto();
    System.out.println(nameProdotto.completeName("auto", randomValue));


    }

}
