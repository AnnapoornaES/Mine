package com.Method.Chaining;

public class Gadget {
	public String name;
	public int num;
	
	public void fixing() {
		System.out.println("invoking fixing..");
		fixing("fan");
		fixing(5);
	}
	public void fixing(String name) {
		System.out.println("invoking fixing with string arg..");
		System.out.println("color is "+this.name);
		
		
	}
	public void fixing(int num) {
		System.out.println("invoking fixing with int arg..");
		System.out.println("number is "+this.num);
		
		
	}
	public void fixing(String name,int num) {
		System.out.println("invoking fixing with string and int arg..");
		fixing("Cuting plaier");
		fixing(6);
		
	}
}
