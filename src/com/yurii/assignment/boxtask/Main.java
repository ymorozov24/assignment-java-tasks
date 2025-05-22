package com.yurii.assignment.boxtask;

import com.yurii.assignment.filtertask.Product;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Using a 'setValue()' method
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Test");
        System.out.println("String value: " + stringBox.getValue());

        //Set a value in constructor and then set the new value in the method
        Box<Double> doubleBox = new Box<>(100.0);
        doubleBox.setValue(101.0);
        System.out.println("Double value: " + doubleBox.getValue());

        //Using custom objects
        Box<Product> customBox = new Box<>();
        customBox.setValue(new Product(1L, "Book A", "Books", 100.0, Set.of()));
        System.out.println("Custom object value: " + customBox.getValue());
    }
}
