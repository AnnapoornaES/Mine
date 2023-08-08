package com.Method.Chaining.Sleeper;
import com.Method.Chaining.*;
public class IronBox_Specs_Umbrella_Stapler_Ladder_Gadget_Plier_Mouse_Sleeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method///////////");
IronBox obj=new IronBox();
obj.ironing();
obj.ironing("Rally", 3345, "Kio Current Iron", 280);


System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

Specs ref=new Specs();
ref.lens();
ref.lens(1.3,"Convex");

System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

Umbrella umb=new Umbrella();
umb.protect();
umb.protect("Purple", 34);


System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");


Stapler sta=new Stapler();
sta.staple()
;
sta.staple("Grey", 45);

System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
Ladder lad=new Ladder();
lad.climb();
lad.climb("white", 4);

System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
Gadget gad=new Gadget();
gad.fixing();
gad.fixing("Stove", 43);

System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
Plier ply=new Plier();
ply.fixing();
ply.fixing("Philipiss", 1);

System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
Mouse mou=new Mouse();
mou.moving();
mou.moving("Asus", 2);



}

}
