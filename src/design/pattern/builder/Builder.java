package design.pattern.builder;

public class Builder {
	private Design design;
	private Process process;
	
	public Builder(Design design, Process process) {
		this.design = design;
		this.process = process;
	}
	
	public Product getProduct() {
		return process.go(design.go());
	}
}
