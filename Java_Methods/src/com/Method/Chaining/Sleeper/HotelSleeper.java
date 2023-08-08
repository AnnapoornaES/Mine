package com.Method.Chaining.Sleeper;

import com.Method.Chaining.Hotel;

public class HotelSleeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method///////////");
		Hotel obj=new Hotel();
		obj.serve();
		obj.serve("Amman Aduge Mane", "NonVeg", "Eregodu", 100);
	}

}
