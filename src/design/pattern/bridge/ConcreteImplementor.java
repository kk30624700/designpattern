package design.pattern.bridge;

public class ConcreteImplementor implements Implementor{
	private Abstraction abstraction;

	public void setAbstraction(Abstraction abstraction) {
		this.abstraction = abstraction;
	}
	@Override
	public void operation() {
		System.out.println("ConcreteImplementor do sth with: " + abstraction);
	}
	
}
