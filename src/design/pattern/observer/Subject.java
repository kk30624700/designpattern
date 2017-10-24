package design.pattern.observer;

public interface Subject {
	public void addObserver(Observer observer);
	public void putMsg();
}
