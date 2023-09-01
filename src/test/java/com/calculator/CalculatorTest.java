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
	
	@Test
	public void testDiv() {
		Calculator calculator = new Calculator();
		assertEquals(4, calculator.div(80, 20));
		assertEquals(60, calculator.div(30, 0.5));
		assertEquals(53, calculator.div(450.5, 8.5));
	}
	
	@Test
	public void testPow() {
		Calculator calculator = new Calculator();
		assertEquals(4, calculator.pow(2, 2));
		assertEquals(9, calculator.pow(3, 2));
	}

	@Test
	public void testSin() {
		Calculator calculator = new Calculator();
		int result = calculator.sin(90);
		assertEquals(2, result);
	}

	@Test
	public void testCos() {
		Calculator calculator = new Calculator();
		int result = calculator.cos(180);
		assertEquals(0, result);
	}

	@Test
	public void testTan() {
		Calculator calculator = new Calculator();
		int result = calculator.tan(45);
		assertEquals(0, result);
	}
}
