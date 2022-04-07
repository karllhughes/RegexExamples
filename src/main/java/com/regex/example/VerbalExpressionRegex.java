package com.regex.example;

import ru.lanwen.verbalregex.VerbalExpression;

public class VerbalExpressionRegex {
    public static void main(String[] args) {
        VerbalExpression testRegex = VerbalExpression.regex()
                .startOfLine().then("abc").or("def")
                .build();
        String testString = "defzzz";
        //Use VerbalExpression's test() method to test if parts if the string match the regex
        System.out.println(testRegex.test(testString));       // true
        System.out.println(testRegex.testExact(testString));  // false
        System.out.println(testRegex.getText(testString));    // returns: def
    }
}
