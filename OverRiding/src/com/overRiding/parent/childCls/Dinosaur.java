package com.overRiding.parent.childCls;

public class Dinosaur extends Mammals{
	@Override
public void fire() {
		super.fire();
	System.out.println("fire in Dinosaur");
}
}
