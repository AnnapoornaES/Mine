package com.encapsulation.access_specifiers.protect;

import com.encapsulation.access_specifiers.BodyLotion;

public class Sunscreen extends BodyLotion{
	@Override
	public void nourish() {
		System.out.println("Overriding nourish methoddddddddddddddddddddd");
		super.nourish();
	}
	public void smoothen() {
		System.out.println("Smoothens the bodyyyyyyyyyyyyyyyyyyyyy");
	}
	@Override
	public void whiten() {
		System.out.println("Overriding whitennnnnnn in Sunscreennnnnnn");
	}
}
