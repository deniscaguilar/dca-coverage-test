package br.com.dca.tools.cobertura;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.dca.coveragetest.MathematicsOperation;

public class MathematicsOperationTest {

	MathematicsOperation mathematicsOperation;

	@Before
	public void setUp() {
		mathematicsOperation = new MathematicsOperation();
	}

	@Test
	public void testAdd() {
		double result = mathematicsOperation.add(1, 2);
		assertTrue(result == 3);
	}

	@Test
	public void testSubtract() {
		double result = mathematicsOperation.subtract(2, 1);
		assertTrue(result == 1);
	}

	@Test
	public void testMultiply() {
		double result = mathematicsOperation.multiply(2, 1);
		assertTrue(result == 2);
	}

	@Test
	public void testDivide() {
		double result = mathematicsOperation.divide(2, 1);
		assertTrue(result == 2);
	}

}
