package com.constructors.Super.chaining;

public class Coffe {
	public String name;
	public String brand;
	public double quantity;
	public double price;
	
	public Coffe (String name, String brand, double quantity, double price) {
		
		System.out.println("invoking String,int,double,double Cpnst. of Coffe");
		

		this.name=name;
		this.brand=brand;
		this.quantity=quantity;
		this.price=price;
	}

}
