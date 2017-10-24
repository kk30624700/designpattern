package design.pattern.adapter;

public class Adapter implements Target{

	private Adaptee adaptee;
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	@Override
	public void targetWorkType() {
		adaptee.adapteeWorkType();
	}

}
