package design.pattern.facade;

public class Facade {
	private SubSystemA subA;
	private SubSystemB subB;
	
	public Facade() {
		subA = new SubSystemA();
		subB = new SubSystemB();
	}
	
	public void run() {
		subA.run();
		subB.run();
	}
}
