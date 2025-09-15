package com.ecommerce.orders;

import com.ecommerce.Customer;
import com.ecommerce.Product;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Encapsulates an order placed by a customer.
 */
public class Order {
    private static int runningId = 1;

    public enum Status { PENDING, CONFIRMED, SHIPPED, DELIVERED, CANCELLED }

    private final int orderId;
    private final Customer customer;
    private final List<Product> products;
    private final LocalDateTime orderDate;
    private Status status;

    public Order(Customer customer) {
        if (customer.getCartContents().isEmpty())
            throw new IllegalStateException("Cannot place an order with an empty cart");

        this.orderId = runningId++;
        this.customer = Objects.requireNonNull(customer);
        this.products = new ArrayList<>(customer.getCartContents());
        this.orderDate = LocalDateTime.now();
        this.status = Status.PENDING;
    }

    public int getOrderId() { return orderId; }
    public Customer getCustomer() { return customer; }
    public List<Product> getProducts() { return Collections.unmodifiableList(products); }
    public LocalDateTime getOrderDate() { return orderDate; }
    public Status getStatus() { return status; }

    public void setStatus(Status status) { this.status = Objects.requireNonNull(status); }

    public double getOrderTotal() {
        return products.stream()
                       .mapToDouble(Product::getPrice)
                       .sum();
    }

    public String generateSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("===== ORDER SUMMARY =====\n");
        sb.append("Order ID : ").append(orderId).append('\n');
        sb.append("Customer : ").append(customer.getName()).append(" (id=").append(customer.getCustomerId()).append(")\n");
        sb.append("Date     : ").append(orderDate).append('\n');
        sb.append("Status   : ").append(status).append("\n\n");
        sb.append("Items:\n");
        products.forEach(p -> sb.append("  - ").append(p).append('\n'));
        sb.append("\nTOTAL: $").append(String.format("%.2f", getOrderTotal()));
        return sb.toString();
    }
}