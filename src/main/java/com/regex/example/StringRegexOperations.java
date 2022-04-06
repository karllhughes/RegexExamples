package com.regex.example;

import java.util.Arrays;

public class StringRegexOperations {
    public static void main(String[] args) {
        String str1 = "J A V A";
        System.out.println(str1.replaceAll("\\s", "")); //prints "JAVA"
        String str2 = "J,AVA";
        System.out.println(str2.replaceFirst(",", "")); //prints "JAVA"
        String str3 = "C,Java,Kotlin,C++";
        System.out.println(Arrays.stream(str3.split(","))
            .filter(s -> s.equals("Java")).findFirst().get()); //prints "Java"
        String str4 = "jane@okta.com";
        System.out.println(str4.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")); //prints true
    }
}
