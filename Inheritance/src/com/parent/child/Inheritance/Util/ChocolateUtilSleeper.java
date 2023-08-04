package com.parent.child.Inheritance.Util;


import com.parent.child.Inheritance.Casting.*;
public class ChocolateUtilSleeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChocolateUtil chacolateUtil = new ChocolateUtil();

		Chocolate chacolate = new Chocolate();
		System.out.println(chacolate.chacolateName);
		chacolateUtil.chacolateUtilMethod(chacolate);

		DarkChocolate darkChacolate = new DarkChocolate();
		System.out.println(darkChacolate.darkChacolateMinerals);
		chacolateUtil.chacolateUtilMethod(darkChacolate);

		CaramelChocolate caramelChacolate = new CaramelChocolate();
		System.out.println(caramelChacolate.mixedWith);
		chacolateUtil.chacolateUtilMethod(caramelChacolate);

	}

}
