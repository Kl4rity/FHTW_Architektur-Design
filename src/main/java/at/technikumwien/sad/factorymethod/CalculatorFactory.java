package at.technikumwien.sad.factorymethod;

public class CalculatorFactory {
	public static Calculator createInstance() {
		if ("true".equalsIgnoreCase(System.getProperty("extended"))) {
			return new CalculatorExtendedImpl();
		}
		
		return new CalculatorSimpleImpl();
	}
}