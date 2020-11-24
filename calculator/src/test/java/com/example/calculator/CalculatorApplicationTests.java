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
}
