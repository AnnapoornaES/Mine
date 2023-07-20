class WoodMain{
public static void main(String[]values){
		System.out.println("Checking constructor Chaining.....");
		Wood obj=new Wood();
		System.out.println("Constructor with NO parameters,,,,,,,,");
		
		System.out.println("!!!!!!!!!!!!!!!!!!!");
		Wood obj1=new Wood("Sandal");
		System.out.println(" Constructor with ONE parameter,,,,,,,,:");
		System.out.println("Name is:"+obj1.name);
		
		System.out.println("!!!!!!!!!!!!!!!!!!!");

		Wood obj2=new Wood("SSSSSS","table");
		System.out.println(" Constructor with TWO parameters,,,,,,,,");
		System.out.println("Name is:"+obj2.name);

		System.out.println(" purpose:"+obj2.purpose);
		
		System.out.println("!!!!!!!!!!!!!!!!!!!");

		Wood obj3=new Wood("Sandal","table","brown");
		System.out.println(" Constructor with THREE parameters,,,,,,,,"+obj3.name+" "+obj3.purpose+" "+obj3.color);
		System.out.println("Name is:"+obj3.name);

		System.out.println(" purpose:"+obj3.purpose);
		System.out.println(" color:"+obj3.color);
		
		System.out.println("!!!!!!!!!!!!!!!!!!!");

		Wood obj4=new Wood("Sandal","table","brown","Softwood");
		System.out.println("Constructor with FOUR parameters,,,,,,,,"+obj4.name+" "+obj4.purpose+" "+obj4.color+" "+obj4.type);
	    System.out.println("Name is:"+obj4.name);

		System.out.println(" purpose:"+obj4.purpose);
		System.out.println(" color:"+obj4.color);
		System.out.println(" type:"+obj4.type);
		
		System.out.println("!!!!!!!!!!!!!!!!!!!");

		Wood obj5=new Wood("Sandal","table","brown","Softwood",54);
		System.out.println("Constructor with FIVE parameters,,,,,,,,"+obj5.name+" "+obj5.purpose+" "+obj5.color+" "+obj5.type+" "+obj5.weight);
		
		System.out.println("Name is:"+obj5.name);

		System.out.println(" purpose:"+obj5.purpose);
		System.out.println(" color:"+obj5.color);
		System.out.println(" type:"+obj5.type);
		System.out.println(" Weight:"+obj5.weight);
		
		
		System.out.println("????????????????????????????????");

		Wood obj6=new Wood("Teak","Furniture","Red","Hardwood",33);
		System.out.println("Constructor with FIVE parameters,,,,,,,,");
		System.out.println("Name is:"+obj6.name);

		System.out.println(" purpose:"+obj6.purpose);
		System.out.println(" color:"+obj6.color);
		System.out.println(" type:"+obj6.type);
		System.out.println(" Weight:"+obj6.weight);
		
}

}