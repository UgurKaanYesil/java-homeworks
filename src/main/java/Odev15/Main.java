package Odev15;

public class Main {
    public static void main(String[] args) {
        // Singleton örneği
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Builder örneği
        Product product = new Product.Builder("Telefon", 999.99)
                .setDescription("Akıllı telefon")
                .build();

        System.out.println("Ürün Adı: " + product.getName());
        System.out.println("Açıklama: " + product.getDescription());
        System.out.println("Fiyat: " + product.getPrice());
    }
}
