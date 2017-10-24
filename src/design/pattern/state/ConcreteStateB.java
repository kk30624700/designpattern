package design.pattern.state;

public class ConcreteStateB extends State {

	public ConcreteStateB(Context context) {
		super(context);
	}

	@Override
	public Context handler() {
		System.out.println("ConcreteStateB");
		return context;
	}

}
