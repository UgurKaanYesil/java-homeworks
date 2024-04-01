package Odev15;

public class Main {
    public static void main(String[] args) {
        // Singleton örneği
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Builder örneği
        Product product = new Product.Builder("Telefon")
                .price(999.99)
                .description("Akıllı Telefon")
                .build();

        System.out.println("Ürün adı : " + product);
    }
}
