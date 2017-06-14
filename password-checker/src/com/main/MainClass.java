package com.main;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.print("Please enter text: ");
			String textToCheck = scanner.next();
			PasswordChecker passwordChecker = new PasswordChecker();
			System.out.print("Number of valid passwords based on the given text: " + passwordChecker.checkPassword(textToCheck));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
