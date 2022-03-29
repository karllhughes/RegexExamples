package com.regex.example;

import java.util.regex.Pattern;

public class TestRegularExpressions {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Java", Pattern.CASE_INSENSITIVE);
        System.out.println(pattern.matcher("java").matches()); // prints true
        System.out.println(pattern.matcher("JAVA").matches()); // prints true
        System.out.println(pattern.matcher("javascript").matches()); // prints false
    }
}
