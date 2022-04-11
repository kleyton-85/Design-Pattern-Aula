package br.com.observer.pattern;

import java.util.Observable;
import java.util.Observer;

//@SuppressWarnings("deprecation")
public class ResponseHandler4 implements Observer {
	private String resp;
	
	public void update(Observable obj, Object arg) {
		if (arg instanceof String) {
			resp = (String) arg;
			System.out.println("\n  --> Received Response 4: " + resp);
		}

	}

}
