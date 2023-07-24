class Power{
	static boolean powerIsRelation;
	 static boolean powerIsbilateral;
	 int voltage;
	 int wattage;
	 
	 Power(boolean powerIsRelation, boolean powerIsbilateral,int voltage,int wattage){
		 System.out.println(" Constructor with FOUR parameter;;;;;;");
		
		this.voltage=voltage;
		this.wattage=wattage;
	 }
	 void instanceMethod(){
		 System.out.println(" IT IS INSTANCE METHOD");
		 System.out.println("voltage is :" +voltage);
		 System.out.println("wattage is :" +wattage);
	 }
	 static void staticMethod(){
		 System.out.println(" IT IS STATIC METHOD");
		 System.out.println("powerIsRelation is :" +powerIsRelation);
		 System.out.println("powerIsbilateral is :" +powerIsbilateral);
	 }
		 
	

}