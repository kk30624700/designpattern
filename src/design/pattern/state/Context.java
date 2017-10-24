package design.pattern.state;

public class Context {
	private State state;
	
	public Context() {
		this.state = new ConcreteStateA(this);
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public Context action() {
		state.handler();
		return this;
	}
}
