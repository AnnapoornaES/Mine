package com.overRiding.parent.childCls;

public class Amoeba extends Bacteria {
	@Override
	public void changeState() {

		System.out.println("Amoeba changes its state............");

		super.changeState();
	}

}
