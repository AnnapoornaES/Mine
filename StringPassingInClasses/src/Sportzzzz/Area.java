package Sportzzzz;

public class Area {
	public String aname;
	public String corporator;
	
public Area(String aname, String corporator)
{
	this.aname=aname;
	this.corporator=corporator;
}
public void printInfo()
{
	System.out.println("Info about Area");
	System.out.println("The Area is :" +this.aname);
	System.out.println("The Corporator Name is :" +this.corporator);
}

}
