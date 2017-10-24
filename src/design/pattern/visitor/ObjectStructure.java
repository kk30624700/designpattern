package design.pattern.visitor;

public class ObjectStructure {
	private Element arr = new ConcreteElement("ConcreteElement");
	private Visitor visitor;
	
	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}
	
	public void print() {
		if (null == visitor)
			throw new RuntimeException();
		arr.accept(visitor);
	}
}
