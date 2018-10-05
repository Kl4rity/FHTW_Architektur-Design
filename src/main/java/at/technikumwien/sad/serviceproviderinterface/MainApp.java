package at.technikumwien.sad.serviceproviderinterface;

public class MainApp {
	public static void main(String[] args) {
		CalculatorService calculatorService = new CalculatorService();
		System.out.println(calculatorService.sum(1, 2, 3));
	}
}