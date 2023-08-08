package com.Method.Chaining;

public class Stapler {
	public String color;
	public int num;
	
	public void staple() {
		System.out.println("invoking staple..");
		staple("Black");
		staple(5);
	}
	public void staple(String color) {
		System.out.println("invoking staple with string arg..");
		System.out.println("color is "+this.color);
		
		
	}
	public void staple(int num) {
		System.out.println("invoking staple with int arg..");
		System.out.println("number is "+this.num);
		
		
	}
	public void staple(String color,int num) {
		System.out.println("invoking staple with string and int arg..");
		staple("Red");
		staple(6);
		
	}
}
