package Sportzzzz;

public class Building {
	public String[] floors;
	public String[] lifts;
	
public Building(String[] floors2, String[] lifts2)
{
	this.floors=floors2;
	this.lifts=lifts2;
}
public void printInfo()
{
	System.out.println("Info of Building");
	for(int pos=0; pos<this.floors.length; pos++)
	{
		String ref=this.floors[pos];
		System.out.println("The Floors are " +ref);
	}
	for(int index=0; index<this.lifts.length; index++)
	{
		String ref1=this.lifts[index];
		System.out.println("The lifts are " +ref1);
	}
	
}

}
