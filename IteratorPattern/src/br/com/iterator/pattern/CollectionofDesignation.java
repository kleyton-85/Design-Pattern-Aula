package br.com.iterator.pattern;

public class CollectionofDesignation implements Container {
	
	public String designation[] = {"Java Programmer", "CEO", "Professorora", "Manager", "Escola/Faculdade"};

	@Override
	public Iterator getIterator() {
		return new CollectionofDesignationIterate();
	}
	
	private class CollectionofDesignationIterate implements Iterator {
		
		int i;
		
		public boolean hasNext() {
			if (i < designation.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return designation[i++];
			}
			
			return null;
		}
		
	}
	
}
