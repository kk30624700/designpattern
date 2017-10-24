package design.pattern.iterator;

public class ConcreteContainer implements Container {

	private int[] arr = {0, 1, 2, 3, 4, 5};
	
	@Override
	public Iterator getIterator() {
		return new ConcreteIterator();
	}
	
	private class ConcreteIterator implements Iterator {
		
		private int index=0;
		
		@Override
		public boolean hasNext() {
			return index < arr.length;
		}

		@Override
		public Object next() {
			if (!this.hasNext())
				return null;
			return arr[index++];
		}

	}

}
