package design.pattern.template;

public class Client {
	public static void main(String[] args) {
		AbstractTemplate tmpa = new ConcreteTemplateA();
		AbstractTemplate tmpb = new ConcreteTemplateB();
		tmpa.run();
		tmpb.run();
	}
}
