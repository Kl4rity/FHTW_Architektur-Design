package at.technikumwien.sad.factorymethod;

import static org.junit.Assert.assertSame;

import org.junit.Test;

public class CalculatorFactoryTest {
	@Test
	public void testCreateInstanceWithDefault() {
		System.clearProperty("extended");
		Calculator calculator = CalculatorFactory.createInstance();
		
		assertSame(calculator.getClass(), CalculatorSimpleImpl.class);
	}
	
	@Test
	public void testCreateInstanceWithExtendedTrue() {
		System.setProperty("extended", "true");
		Calculator calculator = CalculatorFactory.createInstance();
		
		assertSame(calculator.getClass(), CalculatorExtendedImpl.class);
	}
	
	@Test
	public void testCreateInstanceWithExtendedFalse() {
		System.setProperty("extended", "false");
		Calculator calculator = CalculatorFactory.createInstance();
		
		assertSame(calculator.getClass(), CalculatorSimpleImpl.class);
	}
}