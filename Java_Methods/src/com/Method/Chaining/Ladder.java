package com.Method.Chaining;

public class Ladder {
	public String color;
	public int num;
	
	public void climb() {
		System.out.println("invoking climb..");
		climb("Black");
		climb(5);
	}
	public void climb(String color) {
		System.out.println("invoking climb with string arg..");
		System.out.println("color is "+this.color);
		
		
	}
	public void climb(int num) {
		System.out.println("invoking climb with int arg..");
		System.out.println("number is "+this.num);
		
		
	}
	public void climb(String color,int num) {
		System.out.println("invoking climb with string and int arg..");
		climb("Red");
		climb(6);
		
	}

}
