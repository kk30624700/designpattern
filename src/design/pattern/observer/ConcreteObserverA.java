package design.pattern.observer;

public class ConcreteObserverA implements Observer {
	@Override
	public void run() {
		System.out.println("ConcreteObserverA get msg");
	}

}
