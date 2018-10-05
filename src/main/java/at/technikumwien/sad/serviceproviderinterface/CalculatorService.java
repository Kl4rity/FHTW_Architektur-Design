package at.technikumwien.sad.serviceproviderinterface;

import java.util.Iterator;
import java.util.ServiceLoader;

public class CalculatorService {
	
	private ServiceLoader<Calculator> serviceLoader;
	
	public CalculatorService() {
		this.serviceLoader = ServiceLoader.load(Calculator.class);
	}
	
	public int sum(int... numbers) {		
		for(Calculator calculator : serviceLoader) {
			if(calculator.canHandle(numbers)) {
				return calculator.sum(numbers);
			}
		}
		throw new UnsupportedOperationException("No suitable calculator-implementation found.");
	}
}
