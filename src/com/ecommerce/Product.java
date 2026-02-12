package com.ecommerce;

import java.util.Objects;


public final class Product {
    private final int productId;
    private final String name;
    private final double price;

    public Product(int productId, String name, double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative");
        this.productId = productId;
        this.name = Objects.requireNonNull(name, "Name required");
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return String.format("Product{id=%d, name='%s', price=%.2f}", productId, name, price);
    }
}