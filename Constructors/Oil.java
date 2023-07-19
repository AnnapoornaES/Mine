//CONSTRUCTOR OVERLOADINGGGGGGG/////////////

class Oil{
 String name;
 double price;
 int quantity;
 //instance variables
Oil(){
	 System.out.println("It is a default constructor");
	 System.out.println("Oil name :"+name);
	 System.out.println("Oil price :"+price);
     System.out.println("Oil quantity :"+quantity);
	 this.name="Coconut";
	 this.price=125;
	 this.quantity=50;
 }
 Oil(String name){
	 System.out.println("Paramiterized constructor with String .....");
    // System.out.println("Oil name :"+name);
	 //System.out.println("Oil price :"+price);
     //System.out.println("Oil quantity :"+quantity);
	 this.name=name;
	 this.price=23;
	 this.quantity=200;
 }
 Oil(int quantity,String name)
 {
	 System.out.println("Paramiterized constructor with int and String .....");
	 this.name=name;
	 this.price=299;
	 this.quantity=quantity;
 }
 Oil(int quantity,String name,double price)
 {
	 System.out.println("Paramiterized constructor with int  String and double.....");
	 this.name=name;
	 this.price=price;
	 this.quantity=quantity;
 }
}