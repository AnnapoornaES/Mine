package Sportzzzz;

public class Sports {
	public String name;
	public String[] players;
	

public Sports(String name, String[] players2)
{
	this.name=name;
	this.players=players2;
}

public void printInfo()
{
	System.out.println("Info about Sports");
	System.out.println("The Sports Name :" +this.name);
	for(int pos=0; pos<this.players.length; pos++)
	{
		String ref=this.players[pos];
		System.out.println("The player is "+ref +" at the position "+pos);
	}
}

}
