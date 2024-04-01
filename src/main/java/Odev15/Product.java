package Odev15;

public class Product {
    private String name;
    private String description;
    private double price;

    private Product(Builder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.price = builder.price;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    // Builder sınıfı
    public static class Builder {
        private String name;
        private String description;
        private double price;

        public Builder(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
