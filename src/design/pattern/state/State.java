package design.pattern.state;

public abstract class State {
	
	protected Context context;
	
	public State(Context context) {
		this.context = context;
	}
	
	public abstract Context handler();

}
