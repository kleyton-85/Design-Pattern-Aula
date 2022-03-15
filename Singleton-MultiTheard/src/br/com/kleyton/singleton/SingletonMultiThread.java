package br.com.kleyton.singleton;

public class SingletonMultiThread {
	public static void main (String[] args) {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("  --> Se os valores são iguais, o Singleton foi recusado (yay!!)"
							+"\n      se os valores são diferenter, 2 Singleton foram criados (boooo!!) ");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("RESULT:");
		Thread threadFoo = new Thread(new ThreadFoo());
		Thread threadBar = new Thread(new ThreadBar());
		threadFoo.start();
		threadBar.start();
	}
		
	static class ThreadFoo implements Runnable {
		@Override 
		public void run() {
			Singleton singleton = Singleton.getInstance("  ### FOO");
			System.out.println(singleton.value);	
		}
	}
	
	static class ThreadBar implements Runnable {
		@Override
		public void run() {
			Singleton singleton = Singleton.getInstance("  ### BAR");
			System.out.println(singleton.value);
		}
	}
}
