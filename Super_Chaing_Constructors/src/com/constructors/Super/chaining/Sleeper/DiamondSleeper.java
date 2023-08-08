package com.constructors.Super.chaining.Sleeper;
import com.constructors.Super.chaining.*;
public class DiamondSleeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking main in DiamondRunner");

		NaturalDiamond naturaldiamond = new NaturalDiamond();
		System.out.println(naturaldiamond.name);
		System.out.println(naturaldiamond.types);
		System.out.println(naturaldiamond.shape);
		System.out.println(naturaldiamond.quality);

		System.out.println("*******");

		NaturalDiamond naturaldiamond1 = new NaturalDiamond("regular",10,"oval","very good");
		System.out.println(naturaldiamond1.name);
		System.out.println(naturaldiamond1.types);
		System.out.println(naturaldiamond1.shape);
		System.out.println(naturaldiamond1.quality);

	}

}
