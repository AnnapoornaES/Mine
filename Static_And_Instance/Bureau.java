class Bureau{
static String type;
static boolean coating=true;
String color;
float price;

Bureau(String type,String color,float price){
	System.out.println("It is parameterized constructor...");
	this.type=type;
	this.coating=coating;
	this.color=color;
	this.price=price;
}

void Instance(){
		System.out.println("It is Instance method.....");
		System.out.println("color is"+color);
		System.out.println("price is"+price);
}


 static void Static(){
	System.out.println("It is static method.....");
	 boolean coating=false;
	System.out.println("type is"+type);
	System.out.println("Does it coating :"+coating);
}



}