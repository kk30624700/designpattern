package design.pattern.chainofresposibility;

public abstract class Handler {
	private Handler nextHandler;
	
	public void setNextHandler(Handler handler) {
		this.nextHandler = handler;
	}
	
	public void handler() {
		this.action();
		if (null != nextHandler)
			nextHandler.handler();
	}
	
	protected abstract void action();
}
