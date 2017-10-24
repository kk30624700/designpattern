package design.pattern.template;

public abstract class AbstractTemplate {
	public final void run() {
		step1();
		step2();
	}
	
	public abstract void step1();
	
	public abstract void step2();
}
