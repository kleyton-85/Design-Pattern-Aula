package br.com.adapter.pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard {

	public void giveBankDetails() {
		try {
			BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
			
			System.out.print("\n  --> Entre com o Nome do Holder: ");
			String customername = br.readLine();
			System.out.print("\n");
			
			System.out.print("  --> Entre com o Numero da Conta: ");
			long accno = Long.parseLong(br.readLine());
			System.out.print("\n");
			
			System.out.print("  --> Entre com o Nome do Banco: ");
			String bankname = br.readLine();
			
			setAccHolderName(customername);
			setAccNumber(accno);
			setBankName(bankname);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getCreditCard() {
		long accno = getAccNumber();
		String accholdername = getAccHolderName();
		String bname = getBankName();
		return ("\n  #### A conta numero " + accno 
				+ " de " + accholdername + " no " + bname 
				+ " esta Valido e Autenticado para uso no Cartão de Crédito. ####" );
	}

}
