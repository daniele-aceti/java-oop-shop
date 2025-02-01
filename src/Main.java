public class Main {

    public static void main(String[] args) {

        Prodotto result = new Prodotto("cuffie", 100, 1.22);
        System.out.println(result.code);

        System.out.println("Il nome è" + result.getNomeEsteso());

        System.out.println(String.format("Il prezzo base è %f , e quello con l'iva è   %f", result.getPrezzoBase(), result.getPrezzoiva()));
    }
}
