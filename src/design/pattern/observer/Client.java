package design.pattern.observer;

public class Client {
	public static void main(String[] args) {
		Subject sub = new ConcreteSubject();
		sub.addObserver(new ConcreteObserverA());
		sub.addObserver(new ConcreteObserverB());
		sub.putMsg();
	}
}
