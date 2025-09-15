package com.ecommerce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * A customer who owns a shopping cart and can place orders.
 */
public class Customer {
    private final int customerId;
    private final String name;
    private final List<Product> shoppingCart = new ArrayList<>();

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = Objects.requireNonNull(name, "Name required");
    }

    public int getCustomerId() { return customerId; }
    public String getName() { return name; }

    /* ---------- Shopping-cart operations ---------- */
    public void addToCart(Product p) {
        shoppingCart.add(Objects.requireNonNull(p, "Product required"));
    }

    public boolean removeFromCart(Product p) {
        return shoppingCart.remove(p);
    }

    public List<Product> getCartContents() {
        return Collections.unmodifiableList(shoppingCart);
    }

    public double calculateCartTotal() {
        return shoppingCart.stream()
                           .mapToDouble(Product::getPrice)
                           .sum();
    }

    public void clearCart() {
        shoppingCart.clear();
    }
}