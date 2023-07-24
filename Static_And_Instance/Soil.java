class Soil{
	static String color="BLACK";
	 static float price;
	 int quantity;
	 String texture;

	 
	 Soil(float price,int quantity, String texture){
		System.out.println(" Constructor with THREE parameter;;;;;;");
		this.price=price;
		this.quantity=quantity;
		this.texture=texture;
	 }
	 Soil(float price,int quantity, String texture,String color){
		System.out.println(" Constructor with FOUR parameter;;;;;;");
		
		this.quantity=quantity;
		this.texture=texture;
	 }
	 void instanceMethod(){
		 System.out.println(" IT IS INSTANCE METHOD");
		 System.out.println("quantity is :" +quantity);
		 System.out.println("texture is :" +texture);
	 }
	 static void staticMethod(){
		 System.out.println(" IT IS STATIC METHOD");
		 System.out.println("color is :" +color);
		 System.out.println("price is :" +price);
	 }
	 

}