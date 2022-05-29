package br.com.iterator.pattern;

public class IteratorPatternDemo {

	public static void main(String[] args) {
		CollectionofNames companyRepository = new CollectionofNames();
		CollectionofAges companyageRepository = new CollectionofAges();
		CollectionofAddress companyAddressRepository = new CollectionofAddress();
		CollectionofDesignation companyDesignationRepository = new CollectionofDesignation();
		
		for(Iterator iter = companyRepository.getIterator(); iter.hasNext();) {
			String name = (String)iter.next();
			System.out.println("-----------------------------------");
			System.out.println("   --> Name : " + name);
		}
		
		for(Iterator iter = companyageRepository.getIterator(); iter.hasNext();) {
			Integer age = (Integer)iter.next();
			System.out.println("-----------------------------------");
			System.out.println("   --> Idade : " + age);
		}
		
		for(Iterator iter = companyAddressRepository.getIterator(); iter.hasNext();) {
			String address = (String)iter.next();
			System.out.println("-----------------------------------");
			System.out.println("   --> Endereco : " + address);
		}
		
		for(Iterator iter = companyDesignationRepository.getIterator(); iter.hasNext();) {
			String designation = (String)iter.next();
			System.out.println("-----------------------------------");
			System.out.println("   --> Designacao : " + designation);
		}	
	}
}
