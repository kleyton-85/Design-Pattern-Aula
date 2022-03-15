//Registro de Empregados

package br.com.kleyton.Prototype;

public class PrototypeRecord implements Prototype{

	private int id;
	private String nome, designation;
	private double salary;
	private String adress;
	
	public PrototypeRecord() {
		System.out.println("     ### Employee Record ###");
		System.out.println("----------------------------------");
		System.out.println("Eid" + "\t" + "Enome" + "\t" + "Edesignation" + "\t" + "Esalary" + "\t\t" + "Eadress");
	}
	
	public PrototypeRecord(int id, String nome, String designation, double salary, String adress) {
		this();
		this.id = id;
		this.nome = nome;
		this.designation = designation;
		this.salary = salary;
		this.adress = adress;
	}
	
	public void showRecord() {
		System.out.println(id + "\t" + nome + "\t" + designation + "\t" + salary + "\t" + adress);
	}
	
	@Override
	public Prototype getCLone() {
		
		return new PrototypeRecord(id, nome, designation, salary, adress);
	}

	
}

