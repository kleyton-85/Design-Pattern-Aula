package br.com.kleyton.Prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeDemo {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter Employee Id: ");
		int eid = Integer.parseInt(br.readLine());
		System.out.println("\n");
		System.out.println("Enter Employee Nome: ");
		String enome = br.readLine();
		System.out.println("\n");
		System.out.println("Enter Employee Designation: ");
		String edesignation = br.readLine();
		System.out.println("\n");
		System.out.println("Enter Employee Address: ");
		String eaddress = br.readLine();
		System.out.println("\n");
		System.out.println("Enter Employee Salary: ");
		double esalary = Double.parseDouble(br.readLine());
		System.out.println("\n");
		
		PrototypeRecord e1=new PrototypeRecord(eid,enome,edesignation,esalary,eaddress);
		e1.showRecord();
		System.out.println("\n");
		PrototypeRecord e2 = (PrototypeRecord) e1.getCLone();
		
		e2.showRecord();
		
	}
}
