package com.constructors.Super.chaining.Sleeper;
import com.constructors.Super.chaining.*;
public class GroundSleeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking main in Ground");

		Floors floors = new Floors();
		System.out.println(floors.type);
		System.out.println(floors.Floors);
		System.out.println(floors.buildings);
		System.out.println(floors.price);

		System.out.println("************************");

		Floors floors1 = new Floors("man made",6,10,200000000);
		System.out.println(floors1.type);
		System.out.println(floors1.Floors);
		System.out.println(floors1.buildings);
		System.out.println(floors1.price);

	}

}
