package at.technikumwien.sad.dependencyinjection;

public class CalculatorSimpleImpl /* implements Calculator */ {
	/* @Override */
	public int sum(int... numbers) {
		if (numbers == null || numbers.length != 2) {
			throw new IllegalArgumentException("length of numbers not equals 2");
		}
		
		return numbers[0] + numbers[1];
	}
}