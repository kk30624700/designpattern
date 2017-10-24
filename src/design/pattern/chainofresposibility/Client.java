package design.pattern.chainofresposibility;

public class Client {
	public static void main(String[] args) {
		Handler han = new ConcreteHandlerA();
		han.setNextHandler(new ConcreteHandlerB());
		han.handler();
	}
}
