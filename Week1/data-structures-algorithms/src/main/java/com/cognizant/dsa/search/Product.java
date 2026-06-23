package com.cognizant.dsa.search;

public class Product {

    private final int productId;
    private final String productName;
    private final String category;
    private final double price;

    public Product(int productId, String productName, String category, double price) {
        this.productId   = productId;
        this.productName = productName;
        this.category    = category;
        this.price       = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{id=" + productId
                + ", name='" + productName + '\''
                + ", category='" + category + '\''
                + ", price=" + price + '}';
    }
}
