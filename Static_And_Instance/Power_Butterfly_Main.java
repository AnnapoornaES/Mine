class Power_Butterfly_Main{
public static void main(String[] args){
System.out.println("Invoking main in PowerMain");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
Power obj=new Power(true, false, 5, 450);
   obj.instanceMethod();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
   Power.staticMethod();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
Power obj1=new Power(false, false, 15, 490);
  obj1.instanceMethod();
  System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
	Power.staticMethod();

System.out.println("~~~~~~~~~$$$$$$$$$$$$$$$$$$$$$$~~~~~~~~~~~~~");
  System.out.println("~~~~~~~~~$$$$$$$$$$$$$$$$$$$$$$~~~~~~~~~~~~~");
  System.out.println("~~~~~~~~~$$$$$$$$$$$$$$$$$$$$$$~~~~~~~~~~~~~");
  System.out.println("~~~~~~~~~$$$$$$$$$$$$$$$$$$$$$$~~~~~~~~~~~~~");

System.out.println("BUTTERFLY...........------------11111111");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
Butterfly obj2=new Butterfly(15,4,"Female");
   obj2.instance();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
   Butterfly.staticMthd();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
Butterfly obj3=new Butterfly(43,5,"Male");
obj3.instance();
  System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
	Butterfly.staticMthd();
	
}
}