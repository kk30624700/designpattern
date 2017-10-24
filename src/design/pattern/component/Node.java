package design.pattern.component;

public abstract class Node {
	private String name;
	
	public Node(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public abstract Node addNode(Node node) throws RuntimeException;
	
	public void print(int depth) {
		for (int i=0; i<depth; i++)
			System.out.print(" ");
		
		System.out.println(this.name);
		
		if (this instanceof Menu) {
			for (Node node : ((Menu)this).getMenu()) {
				node.print(depth+1);
			}
		}
	}
}
