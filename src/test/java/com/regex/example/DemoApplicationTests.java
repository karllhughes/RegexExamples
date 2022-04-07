package com.regex.example;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DemoApplicationTests {

    /**
     * We will use the following test method `setUp()` that accepts two inputs, i.e. the regex pattern and the string
     * to be searched in the given pattern.
     *
     * @param inputRegex
     * @param searchString
     */
    boolean setUp(String inputRegex, String searchString) {
        Pattern p = Pattern.compile(inputRegex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(searchString);
        return m.matches();
    }

    /**
     * The following test shows how to do email validation using classes available in the `java.util.regex` Java
     * package against the valid input.
     * This test should pass.
     */
    @Test
    void when_email_is_valid() {
        assertTrue(setUp("[a-zA-Z0-9_+&*-]*@" + "okta.com$", "julia@okta.com"));
    }

    /**
     * And this test shows how to do so against an invalid email. This test should result in a failure.
     */
    @Test
    void when_email_is_invalid() {
        assertTrue(setUp("[a-zA-Z0-9_+&*-]*@" + "okta.com$", "julia@okta"));
    }

    /**
     * The following tests show how to do phone validation using classes available in the `java.util.regex`
     * Java package. It uses a basic regular expression to check if the number is a valid ten digit.
     * Advanced use cases could also handle country codes and so forth.
     */
    @Test
    void when_phone_number_is_valid() {
        String regex = "^[0-9]{10}$";
        assertTrue(setUp("^[0-9]{10}$", "1234567890"));
    }

    /**
     * And this test shows how to do so against an invalid phone. This test should result in a failure.
     */
    @Test
    void when_phone_number_is_invalid() {
        String regex = "^[0-9]{10}$";
        assertTrue(setUp("^[0-9]{10}$", "123456789"));
    }
}
