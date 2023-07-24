class BureauMain{
public static void main(String[] args){

System.out.println("Invoking main in BureauMain");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
Bureau obj=new Bureau("METAL","Maroon",345);
   obj.Instance();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
   Bureau.Static();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
Bureau obj1=new Bureau("WOOD","BROWN",555);
  obj1.Instance();
  System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
	Bureau.Static();
	
	
	
	
	
	
	
	
	
}
}