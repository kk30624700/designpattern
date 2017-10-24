package design.pattern.visitor;

public abstract class Element {
	protected String type;
	public Element(String type) {
		this.type = type;
	}
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	public String getType() {
		return this.type;
	}
}
