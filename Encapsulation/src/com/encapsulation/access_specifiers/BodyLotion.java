package com.encapsulation.access_specifiers;

public class BodyLotion {
	String brand;
	float cost;
	
	public void nourish() {
		System.out.println("invoking nourishhhhhhhhhhhhh in bodylotion..........");
		System.out.println(brand);
		System.out.println(cost);
	}
	protected void whiten() {
		System.out.println("invoking whiten in bodylotion");
	}
}
