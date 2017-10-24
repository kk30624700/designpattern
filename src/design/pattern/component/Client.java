package design.pattern.component;

public class Client {
	public static void main(String[] args) {
		Node menu = new Menu("1");
		menu.addNode(new Item("1.1"));
		menu.addNode(new Menu("1.2").addNode(new Item("1.2.1")));
		menu.addNode(new Item("1.3"));
		menu.print(0);
	}
}
