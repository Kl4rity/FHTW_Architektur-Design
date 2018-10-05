package at.technikumwien.sad.singleton;

public class MainApp {
	public static void main(String[] args) {
		IdGenerator idGenerator = IdGenerator.getInstance();
		System.out.println(idGenerator.getNextId());
	}
}