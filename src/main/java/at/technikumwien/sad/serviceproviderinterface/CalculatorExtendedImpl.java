package at.technikumwien.sad.serviceproviderinterface;

import java.util.Arrays;

public class CalculatorExtendedImpl implements Calculator {
	@Override
	public int sum(int... numbers) {
		if (numbers == null) {
			return 0;
		}
		
		return Arrays.stream(numbers).sum();
	}
	
	@Override
	public boolean canHandle(int... numbers) {
		return true;
	}
}