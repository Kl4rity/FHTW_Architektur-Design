package at.technikumwien.sad.serviceproviderinterface;

public class CalculatorSimpleImpl implements Calculator {
	@Override
	public int sum(int... numbers) {
		if (this.canHandle(numbers)) {
			throw new IllegalArgumentException("length of numbers not equals 2");
		}
		
		return numbers[0] + numbers[1];
	}

	@Override
	public boolean canHandle(int... numbers) {
		return (numbers != null && numbers.length == 2);

	}
	
}