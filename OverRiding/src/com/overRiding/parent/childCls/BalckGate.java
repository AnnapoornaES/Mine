package com.overRiding.parent.childCls;

public class BalckGate extends Gate{
	
	@Override
	public void close() {
		System.out.println("Close in BlackGate....");
		super.close();
	}
     
}
