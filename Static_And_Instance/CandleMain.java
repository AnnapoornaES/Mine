class CandleMain{
public static void main(String[] args){
System.out.println("Invoking main in CandleMain");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
Candle obj=new Candle("WHITE","FEST",59,10);
   obj.instance();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
   Candle.Static();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
Candle obj1=new Candle("YELLOW","MARRIAGE",87,45);
  obj1.instance();
  System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
	Candle.Static();	
}
}