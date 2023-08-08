package com.constructors.Super.chaining.Sleeper;
import com.constructors.Super.chaining.*;
public class CoffeSleeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking main in GoldRunner");

		Bites bites = new Bites();
		System.out.println(bites.name);
		System.out.println(bites.brand);
		System.out.println(bites.quantity);
		System.out.println(bites.price);

		System.out.println("*********");

		Bites bites1 = new Bites("coffe","nestle",200,290);
		System.out.println(bites1.name);
		System.out.println(bites1.brand);
		System.out.println(bites1.quantity);
		System.out.println(bites1.price);
	}

}
