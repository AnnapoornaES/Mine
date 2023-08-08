package com.Method.Chaining;

public class IronBox {
public	String brandName;
public float watts;
public String model;
public int volts;
public void ironing() {
	System.out.println("Method with no arg.....");
	ironing("Havells");
	ironing("Bajaj",1250);
}
public void ironing(String brandName) {
	System.out.println("Method with string arg.....");
	this.brandName=brandName;
	System.out.println("Brand Name is:"+this.brandName);
}
public void ironing(String brandName,float watts) {
	System.out.println("Method with string and float arg.....");
	this.brandName=brandName;
	this.watts=watts;
	System.out.println("Brand Name is:"+this.brandName);
	System.out.println("Watt is:"+this.watts);
	
	
}
public void ironing(String brandName,float watts,String model) {
	System.out.println("Method with string  float and String  arg.....");
	
	this.brandName=brandName;
	this.watts=watts;
	this.model=model;
	System.out.println("Brand Name is:"+this.brandName);
	System.out.println("Watt is:"+this.watts);
	System.out.println("model  is:"+this.model);
}
public void ironing(String brandName,float watts,String model,int volts) {
	ironing("Philips",2256,"Tinyo Steam Iron");
	System.out.println("Method with string  float  String  and int arg.....");
	
	this.brandName=brandName;
	this.watts=watts;
	this.model=model;
	this.volts=volts;
	System.out.println("Brand Name is:"+this.brandName);
	System.out.println("Watt is:"+this.watts);
	System.out.println("model  is:"+this.model);
	System.out.println("volts  is:"+this.volts);
}
	
}
