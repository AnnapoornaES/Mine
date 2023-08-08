package com.Method.Chaining;

public class Elevator {
 public String dateOfConstruction="21/08/1998";
 public int numberOfStairs=17;
 
 public void move(){
	 System.out.println("Elevator is moving....");
	 saveTime();
	 climb("15/07/1969",30);
 }
 public void saveTime() {
	 System.out.println("Elevator saves time...");
	 System.out.println("dateOfConstruction is "+this.dateOfConstruction);
	 System.out.println("numberOfStairs is "+this.numberOfStairs);
 }
 public void climb(String dateOfConstruction,int numberOfStairs) {
	 System.out.println("Elevator climb ...");
	 this.dateOfConstruction=dateOfConstruction;
	 this.numberOfStairs=numberOfStairs;
	 System.out.println("dateOfConstruction is "+this.dateOfConstruction);
	 System.out.println("numberOfStairs is "+this.numberOfStairs);
 }
}
