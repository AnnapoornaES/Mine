class Candle{
	static String color;
	static String occasion;
	float price;
	int noOfCandeles;
	
	Candle(String color, String occasion,float price,int noOfCandeles){
		System.out.println("It is PARAMITERIZED CONSTRUCTOR...");
		this.color=color;
		this.occasion=occasion;
		this.price=price;
		this.noOfCandeles=noOfCandeles;
	}
	//static{
		//String color="PINK";
		//String occasion="Naming Ceremony";
	//}
	void instance(){
		System.out.println("It is  INSTANCE METHOD...");
		System.out.println("price is "+price);
		System.out.println("no Of Candeles is "+noOfCandeles);

	}
	static void Static(){
		System.out.println("It is  STATIC METHOD...");
		String color="PINK";
		String occasion="Naming Ceremony";
		System.out.println("color is "+color);
		System.out.println("occasion is "+occasion);
		
	}
	


}