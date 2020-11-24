package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	public void checkZeroOnEmpty() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void checkNumberOnNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void checkSumOnNumbersCommaSeparated() {
		assertEquals(13, Calculator.add("8,5"));
	}

	@Test
	public void checkSumOnMultipleNumbersCommaSeparated() {
		assertEquals(10, Calculator.add("1,2,3,4"));
	}

	@Test
	public void checkSumOnNewLineDelimeter() {
		assertEquals(13, Calculator.add("1,2\n10"));
	}

	@Test
	public void checkSumOnCustomDelimeter() {
		assertEquals(24, Calculator.add("//;\n2;20;2"));
	}

}
