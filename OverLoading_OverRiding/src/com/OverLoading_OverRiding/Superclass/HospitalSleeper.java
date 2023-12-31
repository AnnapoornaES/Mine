package com.OverLoading_OverRiding.Superclass;
import com.OverLoading_OverRiding.Subclass.*;
public class HospitalSleeper {

	public static void main(String[] args) {
		Hospital hospital=new Hospital(); // printing overloading methods in parent class

		hospital.treats();
		hospital.treats(6000.0);
		hospital.treats(200);
		hospital.treats("KIMS");
		hospital.treats("Ram","Cancer");
		hospital.treats("Victoria", "Cold", 500);

		System.out.println("---------------------------");

		Hospital hospital2=new ShobhaHospital();// Achive override through parent class ref

		hospital2.treats();
		hospital2.treats(8000.0);
		hospital2.treats(900);
		hospital2.treats("JAYADEVA");
		hospital2.treats("KARAN","FEWER");
		hospital2.treats("JAYADEVA", "HEADACHE", 200);

		System.out.println("---------------------------");// Achive override through Child class ref

		ShobhaHospital hospital3=new ShobhaHospital();

		hospital3.treats();
		hospital3.treats(6000.0);
		hospital3.treats(200);
		hospital3.treats("KIMS");
		hospital3.treats("RAVI","Viral Fewer");
		hospital3.treats("SS", "HAND PAIN", 900);

	}

}
