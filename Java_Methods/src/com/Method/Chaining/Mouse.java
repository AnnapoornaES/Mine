package com.Method.Chaining;

public class Mouse {
	public String name;
	public int num;
	
	public void moving() {
		System.out.println("invoking moving..");
		moving("HP");
		moving(5);
	}
	public void moving(String name) {
		System.out.println("invoking moving with string arg..");
		System.out.println("color is "+this.name);
		
		
	}
	public void moving(int num) {
		System.out.println("invoking moving with int arg..");
		System.out.println("number is "+this.num);
		
		
	}
	public void moving(String name,int num) {
		System.out.println("invoking moving with string and int arg..");
		moving("Dell");
		moving(6);
		
	}
}
