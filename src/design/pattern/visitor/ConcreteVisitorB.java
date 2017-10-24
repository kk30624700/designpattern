package design.pattern.visitor;

public class ConcreteVisitorB implements Visitor {

	@Override
	public void visit(Element element) {
		System.out.println("ConcreteVisitorB visit " + element.getType());
	}

}
