package design.pattern.singleton;

public class SingletonA {
	private SingletonA() {}

	private static SingletonA instance = new SingletonA();

	public static SingletonA getInstance() {
		return instance;
	}
}
