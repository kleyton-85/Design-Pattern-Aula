package br.com.strategy.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrategyDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("\n  --> Entre com Primeiro Numero: ");
		float value1 = Float.parseFloat(br.readLine());
		
		System.out.println("\n  --> Entre com Primeiro Numero: ");
		float value2 = Float.parseFloat(br.readLine());
		
		System.out.println("\n------------------------------");
		System.out.println("   <<<### RESULTADOS ###>>>");
		System.out.println("------------------------------");
		Context context = new Context(new Addition());
		System.out.println("  --> Adi��o = " + context.executeStrategy(value1, value2));
		
		context = new Context(new Subtraction());
		System.out.println("  --> Subtra��o = " + context.executeStrategy(value1, value2));
		
		context = new Context(new Multiplication());
		System.out.println("  --> Multiplica��o = " + context.executeStrategy(value1, value2));
		
		context = new Context(new Division());
		System.out.println("  --> Divis�o = " + context.executeStrategy(value1, value2));
		
	}

}
