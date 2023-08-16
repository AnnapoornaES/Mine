package com.encapsulation.access_specifiers.main.Sleeper;

import com.encapsulation.access_specifiers.BodyLotion;
import com.encapsulation.access_specifiers.protect.*;

public class BodyLotionSleeper {

	public static void main(String[] args) {
		System.out.println("Running main method.........");
		BodyLotion bodyLotion = new BodyLotion();
		bodyLotion.nourish();
		System.out.println("=======================================================================");
		BodyLotion obj = new Sunscreen();
		obj.nourish();
		// Error : obj.smoothen();
		System.out.println("=======================================================================");
		Sunscreen sunscreen = new Sunscreen();
		sunscreen.nourish();
		sunscreen.smoothen();
		System.out.println("============ref.whiten(); =====error:bcz protected ,,,,,,,,onlu subcls in diff package can.....=========================");
		BodyLotion ref=new BodyLotion();
		ref.nourish();
		System.out.println("===========we can invoke protected method with subcls type, by increasing visibilty ============================================================");
		Sunscreen sun = new Sunscreen();
		sun.nourish();
		sun.smoothen();
		sun.whiten();
	
	}

}
