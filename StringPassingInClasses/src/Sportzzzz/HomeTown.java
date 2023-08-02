package Sportzzzz;

public class HomeTown {
	public String tname;
	public long pincode;
	public String[] area;
	
public HomeTown(String tname, long pincode, String[] area2)
{
	this.tname=tname;
	this.pincode=pincode;
	this.area=area2;
}
public void printInfo()
{
	System.out.println("The Home town name :" +this.tname);
	System.out.println("The PinCode is:" +this.pincode);
	for(int pos=0; pos<this.area.length; pos++)
	{
		String ref=this.area[pos];
		System.out.println("The Area is "+ref);
	}
}

}
