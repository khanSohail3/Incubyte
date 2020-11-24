package com.example.calculator;

public class Calculator {

	public static int add(String input) {
		if(input.isEmpty()) {
			return 0;
		}
		else if(input.contains(",")){
			String[] arr = input.split(",");
			return toInt(arr[0]) + toInt(arr[1]);
		}
		else
			return toInt(input);
	}

	/**
	 * @param arr
	 * @return
	 * @throws NumberFormatException
	 */
	private static int toInt(String arr) throws NumberFormatException {
		return Integer.parseInt(arr);
	}
	
}
