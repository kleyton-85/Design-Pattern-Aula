package br.com.observer.pattern;

public class ObserverDemo {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.out.println("\n  --> Entre com um Texto: ");
		
		final EventSource eventSource = new EventSource();
		
		final ResponseHandler1 responseHandler1 = new ResponseHandler1();
		eventSource.addObserver(responseHandler1);
		
		final ResponseHandler2 responseHandler2 = new ResponseHandler2();
		eventSource.addObserver(responseHandler2);
		
		final ResponseHandler3 responseHandler3 = new ResponseHandler3();
		eventSource.addObserver(responseHandler3);
		
		final ResponseHandler4 responseHandler4 = new ResponseHandler4();
		eventSource.addObserver(responseHandler4);
		
		Thread thread = new Thread(eventSource);
		thread.start();
	}

}
