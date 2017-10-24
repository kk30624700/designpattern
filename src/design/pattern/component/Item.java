package design.pattern.component;

public class Item extends Node {

	public Item(String name) {
		super(name);
	}

	@Override
	public Node addNode(Node node) throws RuntimeException {
		throw new RuntimeException();
	}

}
