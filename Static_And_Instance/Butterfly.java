class Butterfly{
  static String name="LADDU";
  static int age;
  int wings;
  String gender;
  
  
  Butterfly(int age,int wings,String gender){
	  System.out.println("Constructor with three parameter.........");
	  this.wings=wings;
	  this.gender=gender;	  
  }
  Butterfly(String name,int age,int wings,String gender){
	  System.out.println("Constructor with FOURRRR parameter.........");
	  this.wings=wings;
	  this.gender=gender;	  
  }
  void instance(){
	  	  System.out.println("Instance merhod.....");
		  System.out.println("Wings are :"+wings);
		  System.out.println("gender is :"+gender);

  }
  static void staticMthd(){
	  System.out.println("STATIC merhod.....");
	  age=6;
		  System.out.println("name is :"+name);
		  System.out.println("age is :"+age);
  }
  
  
  
  
  
  
  
  
  
}