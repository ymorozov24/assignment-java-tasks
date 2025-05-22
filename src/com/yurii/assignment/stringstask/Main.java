package com.yurii.assignment.stringstask;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Main {

    public static List<String> findLongestString(String[] input) {
        if (input == null || input.length == 0) {
            return Collections.emptyList();
        }

        int maxLength = Arrays.stream(input)
                .filter(Objects::nonNull)
                .mapToInt(String::length)
                .max()
                .orElse(0);

        return Arrays.stream(input)
                .filter(s -> s != null && s.length() == maxLength)
                .toList();
    }

    public static void main(String[] args) {
        String[] input = {"cat", "dog", "red", "is", "am", ""};
        List<String> longestString = findLongestString(input);

        System.out.println("Longest string: " + longestString);
    }
}
