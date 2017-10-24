package design.pattern.command;

public class ConcreteReceiver implements Receiver {

	@Override
	public void action() {
		System.out.println("action");
	}
	
}
