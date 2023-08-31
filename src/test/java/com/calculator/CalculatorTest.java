package test.java.com.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.com.calculator.Calculator;

public class CalculatorTest {
	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
		double result = calculator.sum(2, 3);
		assertEquals(5, result);
	}

	@Test
	public void testSub() {
		Calculator calculator = new Calculator();
		double result = calculator.sub(3, 2);
		assertEquals(1, result);
	}

	@Test
	public void testMult() {
		Calculator calculator = new Calculator();
		assertEquals(88, calculator.mult(8, 11));
	}
}
