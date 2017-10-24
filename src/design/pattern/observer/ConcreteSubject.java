package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
	private List<Observer> list = new ArrayList<>();
	
	public void addObserver(Observer observer) {
		list.add(observer);
	}
	
	public void putMsg() {
		for (Observer observer: list) {
			observer.run();
		}
	}
}
