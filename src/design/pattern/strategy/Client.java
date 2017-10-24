package design.pattern.strategy;

public class Client {
	public static void main(String[] args) {
		Context context = new Context(new ConcreteStrateA());
		context.run();
		context.setStrategy(new ConcreteStrateB());
		context.run();
	}
}
