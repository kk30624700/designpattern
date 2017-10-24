package design.pattern.adapter;

public class ConcreteAdaptee implements Adaptee{

	@Override
	public void adapteeWorkType() {
		System.out.println("adapteeWork");
	}

}
