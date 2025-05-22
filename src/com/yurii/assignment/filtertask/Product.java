package com.yurii.assignment.filtertask;

import java.util.Set;

public class Product {
    private Long id;
    private String name;
    private String category;
    private Double price;
    private Set<Order> orders;

    public Product(Long id, String name, String category, Double price, Set<Order> orders) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return getName();
    }
}
