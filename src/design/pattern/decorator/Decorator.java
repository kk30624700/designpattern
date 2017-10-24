package design.pattern.decorator;

public class Decorator implements Component{
	private Component component;
	public Decorator(Component component) {
		this.component = component;
	}
	@Override
	public void run() {
		System.out.println("Decorator do sth...");
		component.run();
	}
}
