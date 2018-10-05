package at.technikumwien.sad.observer.utils;

import at.technikumwien.sad.observer.News;
import at.technikumwien.sad.observer.Subscriber;

public class MockedSubscriber extends MockedObject implements Subscriber {
	@Override
	public void update(News news) {
		incNumberOfMethodCalls("update");
	}
}