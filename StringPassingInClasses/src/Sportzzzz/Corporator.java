package Sportzzzz;

public class Corporator {
	public String[] buildings;
	public String corname;
	
public Corporator(String[] buildings2, String corname)
{
	this.buildings=buildings2;
	this.corname=corname;
}
public void printInfo()
{
	System.out.println("Info about Corporator");
	for(int index=0; index<this.buildings.length; index++)
	{
		String ref=this.buildings[index];
		System.out.println("The Corporator is "+ref);
	}
	System.out.println("The Corporator name is :" +this.corname);
}

}
