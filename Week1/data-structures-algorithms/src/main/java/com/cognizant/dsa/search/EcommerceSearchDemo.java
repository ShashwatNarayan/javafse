package com.cognizant.dsa.search;

public class EcommerceSearchDemo {

    public static void main(String[] args) {
        Product[] products = {
            new Product(1,  "Laptop",      "Electronics", 999.99),
            new Product(3,  "Smartphone",  "Electronics", 699.99),
            new Product(5,  "Headphones",  "Electronics", 149.99),
            new Product(7,  "Keyboard",    "Accessories",  79.99),
            new Product(9,  "Mouse",       "Accessories",  49.99),
            new Product(11, "Monitor",     "Electronics", 349.99),
            new Product(13, "USB Hub",     "Accessories",  29.99)
        };

        System.out.println("=== Linear Search (unsorted-safe) ===");
        Product found = ProductSearch.linearSearch(products, 5);
        System.out.println(found != null ? found : "Product not found");

        found = ProductSearch.linearSearch(products, 10);
        System.out.println(found != null ? found : "Product not found");

        System.out.println("\n=== Binary Search (requires sorted array by ID) ===");
        found = ProductSearch.binarySearch(products, 9);
        System.out.println(found != null ? found : "Product not found");

        found = ProductSearch.binarySearch(products, 4);
        System.out.println(found != null ? found : "Product not found");
    }
}
