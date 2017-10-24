package design.pattern.menento;

public class Original {
	private State state;
	private Menento menento;
	
	public Original(Storage sto) {
		state = new State();
		menento = new Menento(sto);
	}
	
	public String getState() {
		return state.getInfo();
	}
	
	public void setState(String msg) {
		state.setInfo(msg);
	}
	
	public void load() {
		menento.load();
	}
	
	public void store() {
		menento.store();
	}
	
	private class Menento {
		private Storage storage;
		private Menento(Storage storage) {
			this.storage = storage;
		}
		private void load() {
			state = storage.load();
		}
		private void store() {
			storage.store((State)state.clone());
		}
	}
}
