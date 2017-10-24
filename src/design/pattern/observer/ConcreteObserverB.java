package design.pattern.observer;

public class ConcreteObserverB implements Observer{
	@Override
	public void run() {
		System.out.println("ConcreteObserverB get msg");
	}
}
