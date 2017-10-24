package design.pattern.template;

public class ConcreteTemplateA extends AbstractTemplate{

	@Override
	public void step1() {
		System.out.println("ConcreteTemplateA step1");
	}

	@Override
	public void step2() {
		System.out.println("ConcreteTemplateA step2");
	}

}
