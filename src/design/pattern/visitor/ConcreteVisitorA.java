package design.pattern.visitor;

public class ConcreteVisitorA implements Visitor {

	@Override
	public void visit(Element element) {
		System.out.println("ConcreteVisitorA visit " + element.getType());
	}

}
