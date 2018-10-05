package at.technikumwien.sad.observer;

public class ConsoleSubscriber implements Subscriber {
	@Override
	public void update(News news) {
		System.out.println(news);
	}
}