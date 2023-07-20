class Mall{
 String name;
 String location;
 int numOfStall;
 boolean spa;
 String type;
 int ratingStar;
 String owner;
 
 Mall(){
	 super();
	 System.out.println("It is a NO ARGUMENT constructor----");
 }
 
 Mall(String name){
	 //this();
	 	 System.out.println("It is a constructor with name parameter----");
		 this.name=name;

 }
Mall(String name,String location){
	     this(name);
	 	 System.out.println("It is a constructor with name and location parameter----");
		 this.location=location;

 }
 Mall(String name,String location,int numOfStall){
	     this(name,location);
	 	 System.out.println("It is a constructor with name, location and numOfStall parameter----");
		 this.numOfStall=numOfStall;
}
Mall(String name,String location,int numOfStall,boolean spa){
	     this(name,location,numOfStall);
	 	 System.out.println("It is a constructor with name, location ,numOfStall and Spa parameter----");
		 this.spa=spa;
}
		 
Mall(String name,String location,int numOfStall,boolean spa,String type){
	     this(name,location,numOfStall,spa);
	 	 System.out.println("It is a constructor with name, location ,numOfStall  Spa and type parameter----");
		 this.type=type;
}
Mall(String name,String location,int numOfStall,boolean spa,String type,int ratingStar){
	     this(name,location,numOfStall,spa,type);
	 	 System.out.println("It is a constructor with name, location ,numOfStall,  Spa, type and  parameter----");
		 this.ratingStar=ratingStar;
}
Mall(String name,String location,int numOfStall,boolean spa,String type,int ratingStar,String owner){
	     this(name,location,numOfStall,spa,type,ratingStar);
	 	 System.out.println("It is a constructor with name, location ,numOfStall,  Spa, type and  parameter----");
		 this.owner=owner;
}

}