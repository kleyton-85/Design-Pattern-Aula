package br.com.template.pattern;

import java.util.Scanner;

public class TemplateDemo {

	public static void main(String[] args) {
		
		String jogo = "";
		
		do {
			System.out.println("\n\n-------------------------------------");
			System.out.println("  #### Qual jogo Deseja Jogar? ####" + "\n      1 - Xadrez" + "\n      2- Soccer" + "\n\n  --> Escolha seu Jogo: ");
			Scanner entrada = new Scanner(System.in);
			jogo = entrada.nextLine();
			Game game;
			
			if (jogo.matches("Xadrez")) {
				game = new Chess();
				game.play();
			
			} if (jogo.matches("Soccer")){
				game = new Soccer();
				game.play();
			} 
				
		} while (!jogo.matches("Sair"));
	}
}
