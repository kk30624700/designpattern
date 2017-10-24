package design.pattern.chainofresposibility;

public class ConcreteHandlerB extends Handler {

	@Override
	protected void action() {
		System.out.println("ConcreteHandlerB");
	}

}
