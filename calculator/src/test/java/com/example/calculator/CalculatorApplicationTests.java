package com.example.calculator;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	public void checkZeroOnEmpty() throws Exception {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void checkNumberOnNumber() throws Exception {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void checkSumOnNumbersCommaSeparated() throws Exception {
		assertEquals(13, Calculator.add("8,5"));
	}

	@Test
	public void checkSumOnMultipleNumbersCommaSeparated() throws Exception {
		assertEquals(10, Calculator.add("1,2,3,4"));
	}

	@Test
	public void checkSumOnNewLineDelimeter() throws Exception {
		assertEquals(13, Calculator.add("1,2\n10"));
	}

	@Test
	public void checkSumOnCustomDelimeter() throws Exception {
		assertEquals(24, Calculator.add("//;\n2;20;2"));
	}
	
	@Test
	public void checkNegatives() {
		try {
			Calculator.add("-1,2,3");
			fail("Exception occurred");
		}
		catch(Exception ex) {
			assertEquals("Negatives not allowed: -1!", ex.getMessage());
		}
	}

}
