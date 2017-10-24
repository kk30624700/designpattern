package design.pattern.adapter;

public class Client {
	public static void main(String[] args) {
		new Adapter(new ConcreteAdaptee()).targetWorkType();
	}
}
