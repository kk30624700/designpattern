package design.pattern.bridge;

public abstract class Abstraction {
	protected Implementor impl;
	public Abstraction(Implementor impl) {
		this.impl = impl;
		this.impl.setAbstraction(this);
	}
	public void operation() {
		impl.operation();
	}
}
