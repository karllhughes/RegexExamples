package com.regex.example;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class DemoApplicationTests {

	boolean setUp(String inputRegex, String searchString) {
		Pattern p = Pattern.compile(inputRegex, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(searchString);
		return m.matches();
	}

	@Test
	void when_email_is_valid() {
		assertTrue(setUp("[a-zA-Z0-9_+&*-]*@" + "okta.com$", "julia@okta.com"));
	}

	@Test
	void when_email_is_invalid() {
		assertFalse(setUp("[a-zA-Z0-9_+&*-]*@" + "okta.com$", "julia@okta.com"));
	}

	@Test
	void when_phone_number_is_valid() {
		String regex = "^[0-9]{10}$";
		assertTrue(setUp("^[0-9]{10}$", "1234567890"));
	}

	@Test
	void when_phone_number_is_invalid() {
		String regex = "^[0-9]{10}$";
		assertFalse(setUp("^[0-9]{10}$", "1234567890"));
	}
}
