package com.example.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.Logger;

public class Calculator {

	public static int add(String input) throws Exception {

		if (input.isEmpty())
			return 0;
		else if (Pattern.compile("T(-?[0-9]+)").matcher(input).matches())
			throw new RuntimeException("Negatives not allowed!");
		else if (input.startsWith("//")) {
			String[] arr = customDelimeter(input);
			return sum(input, arr);
		} else {
			String[] arr = input.split(",|\n");
			return sum(input, arr);
		}
	}

	/**
	 * @param input
	 * @param arr
	 * @param sum
	 * @return
	 * @throws NumberFormatException
	 */
	private static int sum(String input, String[] arr) throws NumberFormatException {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += toInt(arr[i]);
		if (sum > 0)
			return sum;
		else
			return toInt(input);
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
