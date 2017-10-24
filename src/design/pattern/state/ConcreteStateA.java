package design.pattern.state;

public class ConcreteStateA extends State {

	public ConcreteStateA(Context context) {
		super(context);
	}

	@Override
	public Context handler() {
		System.out.println("ConcreteStateA");
		context.setState((new ConcreteStateB(context)));
		return context;
	}
	
}
