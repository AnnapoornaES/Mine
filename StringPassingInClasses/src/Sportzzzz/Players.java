package Sportzzzz;

public class Players {

		public String buildings;
		public String pname;
		public int experience;
		public String town;
		
	public Players(String building, String name, int experience, String town2)
	{
		this.buildings=building;
		this.pname=name;
		this.experience=experience;
		this.town=town2;
	}
	public void printInfo()
	{
		System.out.println("Info of Players");
		System.out.println("The building name :" +this.buildings);
		System.out.println("The player name :" +this.pname);
		System.out.println("Experience :" +this.experience);
		System.out.println("The Home Town :" +this.town);
	}

}
