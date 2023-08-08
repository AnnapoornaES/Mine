package com.overRiding.parent.childCls.Sleeper;

import com.overRiding.parent.childCls.*;

public class All_Parent_Sleeper {

	public static void main(String[] args) {
		System.out.println("It is a main method////////////");
		Coal obj = new Coal();
		obj.burn();
		GoodCoal obj2 = new GoodCoal();
		obj2.burn();
		obj2.engine();

		System.out.println("*********************************************");
		Amoeba am = new Amoeba();
		am.changeState();

		System.out.println("*********************************************");
		Bangle ref = new MetalBangle();
		ref.sound();
		MetalBangle meta = (MetalBangle) ref;
		meta.sound();

		System.out.println("*********************************************");
		Gate gate = new BalckGate();
		gate.close();

		System.out.println("*********************************************");
		Dinosaur dino = new Dinosaur();
		dino.fire();
		System.out.println("*********************************************");
		Flex fl = new Flex();
		fl.adds();
		System.out.println("*********************************************");
		Mic mic = new Mic();
		mic.dj();
		System.out.println("*********************************************");
		Drum dr=new Drum();
		dr.fill();
		System.out.println("*********************************************");
		Theater ht=new HomeTheater();
		ht.show();
		System.out.println("*********************************************");
		Collection col=new Collection();
		col.line();
	}

}
