package design.pattern.chainofresposibility;

public class ConcreteHandlerA extends Handler {

	@Override
	protected void action() {
		System.out.println("ConcreteHandlerA");
	}

}
