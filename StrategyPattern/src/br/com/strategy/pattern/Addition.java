package br.com.strategy.pattern;

public class Addition implements Strategy {

	public float calculation(float a, float b) {

		return a + b;
	}

}
