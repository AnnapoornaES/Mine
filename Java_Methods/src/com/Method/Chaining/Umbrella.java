package com.Method.Chaining;

public class Umbrella {
	public String color;
	public int num;
	
	public void protect() {
		System.out.println("invoking umbrella..");
		protect("Black");
		protect(5);
	}
	public void protect(String color) {
		System.out.println("invoking umbrella with string arg..");
		System.out.println("color is "+this.color);
		
		
	}
	public void protect(int num) {
		System.out.println("invoking umbrella with int arg..");
		System.out.println("number is "+this.num);
		
		
	}
	public void protect(String color,int num) {
		System.out.println("invoking umbrella with string and int arg..");
		protect("Red");
		protect(6);
		
	}
}
