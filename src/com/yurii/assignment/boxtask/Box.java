package com.yurii.assignment.boxtask;

public class Box<T> {
    private T value;

    public Box() {}

    public Box(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
