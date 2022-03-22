package br.com.facade.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClienteMobileShop {
	
	private static int choice;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		do {
			System.out.println("\n #### MOBILE SHOP ####"
								+ "\n  1- IPHONE"
								+ "\n  2- SAMSUNG "
								+ "\n  3- BLACKBERRY"
								+ "\n  4- EXIT"
								+ "\n ### ESCOLHA UMA OPÇÃO: ");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			choice = Integer.parseInt(br.readLine());
			
			ShopKeeper sk = new ShopKeeper();
			
			switch(choice) {
				case 1:
					sk.iphoneSale();
					break;
				case 2:
					sk.samsungSale();
					break;
				case 3:
					sk.blackberrySale();
					break;
				default:
					System.out.println("\n--------------------------");
					System.out.println("  --> Nada foi Comprado!");
					System.out.println("--------------------------");
			}	
		} while (choice != 4);
	}
}
