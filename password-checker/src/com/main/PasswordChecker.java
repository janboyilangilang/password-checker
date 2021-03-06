package com.main;

public class PasswordChecker {
	
	int checkPassword(String text) {
		int counter = 0;
		for (int i = 0; i <= text.length(); i++) {
			for (int j = i; j <= text.length(); j++) {
				String str = text.substring(i, j);
				if(isValid(str) && str.length() > 8) {
					System.out.println("This is a valid password: " + str);
					counter++;
				}
			}	
		}
		return counter;
	}
	
	private boolean isValid(String password) {
		if(withUpperChar(password) && isLetterOnly(password)) {
			return true;
		}
		return false;
	}
	
	boolean withUpperChar(String password) {
		for (int i = 0; i < password.length(); i++) {
			if(Character.isUpperCase(password.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	boolean isLetterOnly(String password) {
		for (int i = 0; i < password.length(); i++) {
			if(!Character.isLetter(password.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
