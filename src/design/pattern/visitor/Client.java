package design.pattern.visitor;

public class Client {
	public static void main(String[] args) {
		ObjectStructure obj = new ObjectStructure();
		obj.setVisitor(new ConcreteVisitorA());
		obj.print();
		obj.setVisitor(new ConcreteVisitorB());
		obj.print();
	}
}
