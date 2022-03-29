package br.com.composite.pattern;

import java.util.Iterator;

public class Cashier implements Employee {
	private int id;
	private String name;
	private double salary;
	
	public Cashier(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getSalary() {
		return salary;
	}

	@Override
	public void print() {
		System.out.println("======================");
		System.out.println("Id     = " + getId());
		System.out.println("Name   = " + getName());
		System.out.println("Salary = R$ " + getSalary());
		System.out.println("======================");
		
	}

	@Override
	public void add(Employee employee) {
		// nao é aplicado

	}

	@Override
	public void remove(Employee employee) {
		// nao é aplicado

	}

	@Override
	public Employee getChild(int i) {
		// nao é aplicado
		return null;
	}

}
