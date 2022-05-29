package br.com.iterator.pattern;

public class CollectionofNames implements Container {
	
	public String name[]={"Roberto Aragy", "Enilda Caceres", "Claudia Nasu", "Roberto Murilo", "Estacio de Sa"};

	@Override
	public Iterator getIterator() {
		return new CollectionofNamesIterate();
	}
	
	private class CollectionofNamesIterate implements Iterator {
		
		int i;
		
		public boolean hasNext() {
			if (i < name.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return name[i++];
			}
			
			return null;
		}
	}	
}
