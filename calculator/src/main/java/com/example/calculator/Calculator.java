package com.example.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.Logger;

public class Calculator {

	public static int add(String input) {

		if (input.isEmpty()) {
			return 0;
		} else if (input.startsWith("//")) {
			String[] arr = customDelimeter(input);
			System.out.println("arr" + arr);
			int sum = 0;
			for (int i = 0; i < arr.length; i++)
				sum += toInt(arr[i]);
			return sum;
		} else {
			String[] arr = input.split(",|\n");
			int sum = 0;
			for (int i = 0; i < arr.length; i++)
				sum += toInt(arr[i]);
			if(sum > 0)
				return sum;
			else
				return toInt(input);
		}
	}

	/**
	 * @param input
	 * @return
	 */
	private static String[] customDelimeter(String input) {
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
		m.matches();
		String delimeter = m.group(1);
		String numbers = m.group(2);
		System.out.println("delimeter" + delimeter + "numbers" + numbers);
		return numbers.split(delimeter);
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
