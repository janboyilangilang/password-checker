package com.main;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PasswordCheckerTest {
	
	private PasswordChecker passwordChecker;

	@Before
	public void setUp() throws Exception {
		passwordChecker = new PasswordChecker();
	}

	@Test
	public void isLetterOnlyTest() {
		assertTrue(passwordChecker.isLetterOnly("janboy"));
		assertFalse(passwordChecker.isLetterOnly("janb0y"));
		assertFalse(passwordChecker.isLetterOnly("12345"));
	}
	
	@Test
	public void withUpperCharTest() {
		assertTrue(passwordChecker.withUpperChar("Janboy"));
		assertTrue(passwordChecker.withUpperChar("JanBoy"));
		assertFalse(passwordChecker.withUpperChar("janboy"));
		assertFalse(passwordChecker.withUpperChar("janb0y"));
		assertFalse(passwordChecker.withUpperChar("12345"));
	}
	
	@Test
	public void checkPasswordTest() {
		assertEquals(0, passwordChecker.checkPassword("janboyilangilang"));
		assertEquals(0, passwordChecker.checkPassword("Janboy1lang1lanG"));
		assertEquals(6, passwordChecker.checkPassword("JANBOYilang1lang"));
		assertEquals(0, passwordChecker.checkPassword("1234567890"));
	}

}
