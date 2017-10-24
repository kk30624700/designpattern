package design.pattern.iterator;

public class Client {
	public static void main(String[] args) {
		Iterator it = new ConcreteContainer().getIterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
