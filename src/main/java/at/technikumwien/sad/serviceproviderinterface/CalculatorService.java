package at.technikumwien.sad.serviceproviderinterface;

import java.util.Iterator;
import java.util.ServiceLoader;

public class CalculatorService {
	
	private ServiceLoader<Calculator> serviceLoader;
	
	public CalculatorService() {
		this.serviceLoader = ServiceLoader.load(Calculator.class);
	}
	
	public int sum(int... numbers) {
		Calculator calculator = serviceLoader.iterator().next();
		
		// for(Calculator calculator : serviceLoader) {
		//	System.out.println(calculator.getClass().getName());
		// }
		
		//TODO! use simple or extended implementation.
		return calculator.sum(numbers);
	}
	
}
