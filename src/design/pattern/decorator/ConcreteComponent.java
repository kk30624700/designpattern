package design.pattern.decorator;

public class ConcreteComponent implements Component{

	@Override
	public void run() {
		System.out.println("ConcreteComponent Run");
	}

}
