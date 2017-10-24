package design.pattern.bridge;

public class Client {
	public static void main(String[] args) {
		new ConcreteAbstraction(new ConcreteImplementor()).operation();
	}
}
