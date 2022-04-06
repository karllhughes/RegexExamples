package com.regex.example;

import java.util.regex.Pattern;

public class EmailRegex {
    public static void main(String[] args) {
        String emailRegularExpression = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegularExpression);
        System.out.println(pattern.matcher("john@gmail@gmail.com").matches()); // prints false
        System.out.println(pattern.matcher("bruce@gmail.com").matches()); // prints true
    }
}
