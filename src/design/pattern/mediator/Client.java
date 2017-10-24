package design.pattern.mediator;

public class Client {
	public static void main(String[] args) {
		Mediator med = new Mediator();
		Coleague A = new Coleague("A", med);
		Coleague B = new Coleague("B", med);
		A.sendMsg("B", "hello world");
	}
}
