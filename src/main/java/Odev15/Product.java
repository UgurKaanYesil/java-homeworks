package Odev15;

public class Product {
    private String name;
    private String description;
    private double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }


    // Builder sınıfı
    public static class Builder {
        private String name;
        private String description;
        private double price;

        public Builder(String name) {
            this.name = name;
        }
        public Builder price(double price) {
            this.price = price;
            return this;
        }
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Product build() {
            return new Product(name,description,price);
        }
    }
}
