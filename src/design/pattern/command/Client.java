package design.pattern.command;

public class Client {
	public static void main(String[] args) {
		new ConcreteCommand(new ConcreteReceiver()).execute();
	}
}
