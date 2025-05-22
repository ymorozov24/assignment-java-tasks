package com.yurii.assignment.filtertask;

import java.util.*;

public class Main {

    public static List<Product> filterBooks(List<Product> products, String category, double price) {
        if (products == null || products.isEmpty()) {
            return Collections.emptyList();
        }

        return products.stream()
                .filter(Objects::nonNull)
                .filter(p -> category.equals(p.getCategory()))
                .filter(p -> p.getPrice() != null && p.getPrice() > price)
                .toList();
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1L, "Book A", "Books", 100.0, Set.of()),
                new Product(2L, "Book B", "Books", 1.0, Set.of()),
                new Product(3L, "Book C", "Books", 120.0, Set.of()),
                new Product(4L, "Forbes", "Magazine", 999.99, Set.of())
        );

        List<Product> result = filterBooks(products, "Books", 100);

        System.out.println("Filtered products:");
        result.forEach(System.out::println);
    }
}
