package design.pattern.bridge;

public class ConcreteAbstraction extends Abstraction {
	public ConcreteAbstraction(Implementor impl) {
		super(impl);
	}

	@Override
	public void operation() {
		System.out.println("ConcreteAbstraction do sth");
		impl.operation();
	}
}
