package com.example.calculator;

public class Calculator {

	public static int add(String input) {
		if(input.isEmpty()) {
			return 0;
		}
		else {
			return Integer.parseInt(input);
		}
	}
	
}
