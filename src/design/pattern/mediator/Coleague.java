package design.pattern.mediator;

public class Coleague {
	private String info;
	private Mediator mediator;
	public Coleague(String info, Mediator mediator) {
		this.info = info;
		this.mediator = mediator;
		mediator.register(info, this);
	}
	public void sendMsg(String coleague, String msg) {
		mediator.transfer(this.info, coleague, msg);
	}
	public void receive(String from, String msg) {
		System.out.println(info + " receive from " + from +": " +msg);
	}
}
