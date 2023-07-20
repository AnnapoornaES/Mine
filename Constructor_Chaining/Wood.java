class Wood{
	String name;
	String purpose;
	String color;
	String type;
	int weight;
	
	Wood()
	{
		super();
		System.out.println("No argument Constructor........");
    }
	Wood(String name){
		this();
		System.out.println("Constructor with string type.........");
		this.name=name;

	}
	Wood(String name,String purpose){
		this(name);
		System.out.println("Constructor with string and String type.........");
		
		this.purpose=purpose;
		
	}
	Wood(String name,String purpose,String color){
		this(name,purpose);
		System.out.println("Constructor with string, String  and String type.........");
		
		this.color=color;
		
	}
	Wood(String name,String purpose,String color,String type){
		this(name,purpose,color);
		System.out.println("Constructor with string, String ,String  and String type.........");
		
		this.type=type;
		
	}
	Wood(String name,String purpose,String color,String type,int weight){
		this(name,purpose,color,type);
		
		System.out.println("Constructor with string, String ,String  , String  and int type.........");
		this.weight=weight;
	}


}