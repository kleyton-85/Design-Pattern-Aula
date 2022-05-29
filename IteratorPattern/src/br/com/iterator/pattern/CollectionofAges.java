package br.com.iterator.pattern;

public class CollectionofAges implements Container {
	
	public int age[]= {21, 38, 46, 967, 99};

	@Override
	public Iterator getIterator() {
		return new CollectionofAgesIterate();
	}
	
	private class CollectionofAgesIterate implements Iterator {
		
		int i;
		
		public boolean hasNext() {
			if (i < age.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return age[i++];
			}			
			return null;
		}	
	}
}

