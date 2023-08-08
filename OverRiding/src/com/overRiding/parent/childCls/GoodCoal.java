package com.overRiding.parent.childCls;

public class GoodCoal extends Coal{
   @Override
public void burn() {
	super.burn();
	System.out.println("burining coal with no fire in Subbbb clsss......");
}
  
   public void engine() {
		burn();
		System.out.println("burining coal with no fire in engineeeee clsss......");
	}
}
