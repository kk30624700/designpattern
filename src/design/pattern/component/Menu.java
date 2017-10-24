package design.pattern.component;

import java.util.ArrayList;
import java.util.List;

public class Menu extends Node {
	private List<Node> menu = new ArrayList<>();
	
	public Menu(String name) {
		super(name);
	}

	public List<Node> getMenu() {
		return menu;
	}
	@Override
	public Node addNode(Node node) throws RuntimeException {
		menu.add(node);
		return this;
	}
	
}
