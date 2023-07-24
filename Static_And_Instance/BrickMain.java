class BrickMain{
public static void main(String[] args){
System.out.println("Invoking main in BrickMain");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
Brick obj=new Brick(56,666,678);
   obj.printInstance();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
   Brick.printStatic();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
Brick obj1=new Brick(87,45,900);
  obj1.printInstance();
  System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
	Brick.printStatic();

System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
Brick obj2=new Brick("RED",37,65,870);
  obj2.printInstance();	
  System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
	Brick.printStatic();
	
  System.out.println("~~~~~~~~~$$$$$$$$$$$$$$$$$$$$$$~~~~~~~~~~~~~");
  System.out.println("~~~~~~~~~$$$$$$$$$$$$$$$$$$$$$$~~~~~~~~~~~~~");
  System.out.println("~~~~~~~~~$$$$$$$$$$$$$$$$$$$$$$~~~~~~~~~~~~~");
  System.out.println("~~~~~~~~~$$$$$$$$$$$$$$$$$$$$$$~~~~~~~~~~~~~");
	
	System.out.println("Soil main '''''''''''''''''");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
Soil obj3=new Soil( 200, 1, "Sandy");
   obj3.instanceMethod();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
   Soil.staticMethod();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
Soil obj4=new Soil(450,4,"Clay","Light Brown");
  obj4.printInstance();
  System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
  Soil.printStatic();

}
}