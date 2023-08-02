package Sportzzzz;

public class SportsSleeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoking main in Sports Runner....");
		String name="Cricket";
		String[] players= {"MS Dhoni", "Virat Kohli", "Jadeja", "Suresh Raina", "Kapil Dev"};
		
		String building= "Kailashpathi";
		String pname="Mahendra Singh Dhoni";
		int experience=20;
		String town="Ranchi";
		
		String aname="Harmu Housing Colony";
		String corporator="Asha Lakra";
		
		String[] buildings= {"Apartment 1", "Apartment 2"};
		String corname="Asha Lakra";
		
		String tname="Ranchi";
		long pincode=834001;
		String[] area= {"Lalpur", "Argora", "Hesag", "Bariatu","Morabadi"};
		
		String[] floors= {"5", "22", "8","10", "12"};
		String[] lifts= {"6", "4", "2", "3", "5"};
		
		String fname="Floor 4th";
		int no=24;
		
		int lno=28;
		
		Sports sport=new Sports(name, players);
		sport.printInfo();
System.out.println("\n");
		
		Players play=new Players(building, pname, experience, town);
		play.printInfo();
		System.out.println("\n");
		
		Area area1=new Area(aname, corporator);
		area1.printInfo();
		System.out.println("\n");
		
		Corporator corporator1=new Corporator(buildings, corname);
		corporator1.printInfo();
		System.out.println("\n");
		
		HomeTown hometown=new HomeTown(tname, pincode, area);
		hometown.printInfo();
		System.out.println("\n");
		
		Building building1=new Building(floors, lifts);
		building1.printInfo();
		System.out.println("\n");
		
		Floor floor=new Floor(fname, no);
		floor.printInfo();
		System.out.println("\n");
		
		Lift lift = new Lift(lno);
		lift.printInfo();
	}

	}


