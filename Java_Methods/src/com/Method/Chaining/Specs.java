package com.Method.Chaining;

public class Specs {
	public double power;
	public	String type;
	
	public void lens() {
		System.out.println("invoking lens...");
		lens(1.5);
		lens("Concave");
		
	}
	public void lens(double power) {
		System.out.println("invoking lens with double...");
		System.out.println("power"+power);
	}
	public void lens(String type) {
		System.out.println("invoking lens with string...");
		System.out.println("type"+type);
	}
	public void lens(double power,String type) {
		System.out.println("invoking lens with string and double...");
		System.out.println("type"+type);
		System.out.println("power"+power);

	}
	
	
}
