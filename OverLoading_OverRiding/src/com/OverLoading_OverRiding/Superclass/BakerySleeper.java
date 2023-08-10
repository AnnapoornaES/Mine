package com.OverLoading_OverRiding.Superclass;

import com.OverLoading_OverRiding.Subclass.*;

public class BakerySleeper {

	public static void main(String[] args) {
		System.out.println("Running main method..........");
		Bakery bakery = new Bakery();// printing overloading methods in parent class

		bakery.bake();
		bakery.bake(499.0);
		bakery.bake(10);
		bakery.bake("Sweet");
		bakery.bake("Cake", 49);
		bakery.bake("Juice", 10, 200);

		System.out.println("------------------------------");

		Bakery bakery2 = new Pups(); // Achive override through parent class ref

		bakery2.bake();
		bakery2.bake(699.0);
		bakery2.bake(9);
		bakery2.bake("Peda");
		bakery2.bake("Badam Sweet", 50);
		bakery2.bake("Juice", 20, 900);

		System.out.println("------------------------------");// Achive override through Child class ref

		Pups bakery3 = new Pups();

		bakery3.bake();
		bakery3.bake(899.0);
		bakery3.bake(5);
		bakery3.bake("Buiscuits");
		bakery3.bake("Cake", 49);
		bakery3.bake("Juice", 20, 700);
		
		System.out.println("------------------------------");
		
		Hotel hotel=new Hotel();

		hotel.roomFacility();
		System.out.println("HAS FOOd Facility : "+hotel.roomFacility(true));
		hotel.roomFacility(5000);
		hotel.roomFacility("COLORS");
		hotel.roomFacility(1000,90);
		hotel.roomFacility("SiriMane", 2000, 101);

		System.out.println("==============");

		Hotel hotel1=new Catreen();				//override with parent class ref

		hotel1.roomFacility();
		System.out.println("HAS FOOd Facility : "+hotel1.roomFacility(false));
		hotel1.roomFacility(8000);
		hotel1.roomFacility("OTP");
		hotel1.roomFacility(3000,90);
		hotel1.roomFacility("CFD", 300, 202);

		System.out.println("==================");

		Catreen hotel2=new Catreen();//override with SUb class reff
		
		hotel2.roomFacility();
		System.out.println("HAS FOOd Facility : "+hotel2.roomFacility(true));
		hotel2.roomFacility(900);
		hotel2.roomFacility("RAMESHWARA CAFE");
		hotel2.roomFacility(700,90);
		hotel2.roomFacility("District 17", 8000, 303);
		
		System.out.println("==================");
		System.out.println("==================");
		
		
		
		
		
		
		
		
	}

}
