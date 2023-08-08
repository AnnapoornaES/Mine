package com.Method.Chaining;

public class Hotel {
	public	String name;
	public String type;
	public String location;
	public int stars;
	
	public void serve() {
		System.out.println("Method with no arg.....");
		serve("Panchathara");
		serve("Upahara","Veg");
	}
	public void serve(String name) {
		System.out.println("Method with string arg.....");
		this.name=name;
		System.out.println(" Name is:"+this.name);
	}
	public void serve(String name,String type) {
		System.out.println("Method with string and float arg.....");
		this.name=name;
		this.type=type;
		System.out.println(" Name is:"+this.name);
		System.out.println("type is:"+this.type);
		
		
	}
	public void serve(String name,String type,String location) {
		System.out.println("Method with string  float and String  arg.....");
		
		this.name=name;
		this.type=type;
		this.location=location;
		System.out.println(" Name is:"+this.name);
		System.out.println("type is:"+this.type);
		System.out.println("location  is:"+this.location);
	}
	public void serve(String name,String type,String location,int stars) {
		serve("Grand","NonVeg","Kumblugodu",4);
		System.out.println("Method with string  float  String  and int arg.....");
		
		this.name=name;
		this.type=type;
		this.location=location;
		this.stars=stars;
		System.out.println(" Name is:"+this.name);
		System.out.println("type is:"+this.type);
		System.out.println("location  is:"+this.location);
		System.out.println("Star  is:"+this.stars);
	}
}
