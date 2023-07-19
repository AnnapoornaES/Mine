class OilMain{
	
	public static void main(String[] args){
		
		System.out.println("Executing main method..... ");
		Oil oil=new Oil();
		System.out.println("Main nal iro name :"+oil.name);
		System.out.println("Main nal iro price :"+oil.price);
		System.out.println("Main nal iro quantity :"+oil.quantity);
		System.out.println("------------");
		
        Oil oil1=new Oil("Olive");
        System.out.println("Main nal iro name :"+oil1.name);
		System.out.println("Main nal iro price :"+oil1.price);
		System.out.println("Main nal iro quantity :"+oil1.quantity);
		
		System.out.println("------------");
		
		Oil oil2=new Oil(5,"Castor");
		System.out.println("Main nal iro name :"+oil2.name);
		System.out.println("Main nal iro price :"+oil2.price);
		System.out.println("Main nal iro quantity :"+oil2.	quantity);
		
		System.out.println("------------");
		
		Oil oil3=new Oil(5,"Castor",555);
		System.out.println("Main nal iro name :"+oil3.name);
		System.out.println("Main nal iro price :"+oil3.price);
		System.out.println("Main nal iro quantity :"+oil3.quantity);
		
	}
}