package com.parent.child.Inheritance.Casting;

public class ChocolateUtil extends Chocolate{
	public void chacolateUtilMethod(Chocolate chacolate) {
		Chocolate chacolate2 = new Chocolate();
		chacolate2.chacolate();

		if (chacolate instanceof DarkChocolate) {
			Chocolate chacolate3 = new DarkChocolate();
			DarkChocolate darkChacolate = (DarkChocolate) chacolate3;
			darkChacolate.darkChacolteMethod();
		}

		if (chacolate instanceof CaramelChocolate) {
			Chocolate chacolate4 = new CaramelChocolate();
			CaramelChocolate caramelChacolate = (CaramelChocolate) chacolate4;
			caramelChacolate.caramelChacolateMethod();
		}
	}

}
