class Brick{
	 static String color="Orange";
	 static int weight;
	 int noOfBricks;
	 float price;
	 
	 
	 Brick(int weight,int noOfBricks,float price){
		 System.out.println(" Constructor with FOUR parameter;;;;;;");
		 color=color;
		 this.weight=weight;
		 this.noOfBricks=noOfBricks;
		 this.price=price;
	 }
	 Brick(String color,int weight,int noOfBricks,float price){
		 System.out.println(" Constructor with FOUR parameter;;;;;;");
		 this.color=color;
		 this.weight=weight;
		 this.noOfBricks=noOfBricks;
		 this.price=price;
	 }
	 
	 void printInstance(){
		 System.out.println("INSTANCE METHOD.......");
		 System.out.println("Number of Bricks : "+noOfBricks);
		 System.out.println("Price is :"+price); 
	 }
	 static void printStatic(){
		 System.out.println("STATIC METHOD.......");
		 System.out.println("Color is : "+color);
		 System.out.println("Weight is :"+weight); 
	 }
	 

}