class Park{
String name;
int noOfPeople;
String type;
boolean playArea;
int noOfTrees;
boolean walkAreaType;
boolean gymEquip;
String securityName;
int numOfEntrance;

Park(){
	this("PushpakaVimana",50,"Local Park",true,45,true,false,"Sulemaan",5);
		 System.out.println("It is a NO ARGUMENT constructor----");

}
Park(String name){
	
	System.out.println("It is a constructor with name parameter----");
		 this.name=name;
}

Park(String name,int noOfPeople){
	this(name);
	System.out.println("It is a constructor with name and int parameter----");
		 this.noOfPeople=noOfPeople;
}
Park(String name,int noOfPeople,String type){
	this(name,noOfPeople);
	System.out.println("It is a constructor with name, int ,string parameter----");
		 this.type=type;
}
Park(String name,int noOfPeople,String type,boolean playArea){
	this(name,noOfPeople,type);
	System.out.println("It is a constructor with name,int string and boolean parameter----");
		 this.playArea=playArea;
}
Park(String name,int noOfPeople,String type,boolean playArea,int noOfTrees){
	this(name,noOfPeople,type,playArea);
	System.out.println("It is a constructor with name,int,string ,boolean and int parameter----");
		 this.noOfTrees=noOfTrees;
		 
}
Park(String name,int noOfPeople,String type,boolean playArea,int noOfTrees,boolean walkAreaType){
	this(name,noOfPeople,type,playArea,noOfTrees);
	System.out.println("It is a constructor with name,int,string ,boolean , int  and boolean parameter----");
		 this.walkAreaType=walkAreaType;
}
Park(String name,int noOfPeople,String type,boolean playArea,int noOfTrees,boolean walkAreaType,boolean gymEquip){
	this(name,noOfPeople,type,playArea,noOfTrees,walkAreaType);
	System.out.println("It is a constructor with name,int,string ,boolean , int boolean and boolean parameter----");
		 this.gymEquip=gymEquip;
}

Park(String name,int noOfPeople,String type,boolean playArea,int noOfTrees,boolean walkAreaType,boolean gymEquip,String securityName){
	this(name,noOfPeople,type,playArea,noOfTrees,walkAreaType,gymEquip);
	System.out.println("It is a constructor with name,int,string ,boolean , int boolean and boolean parameter----");
		 this.securityName=securityName;
}
Park(String name,int noOfPeople,String type,boolean playArea,int noOfTrees,boolean walkAreaType,boolean gymEquip,String securityName,int numOfEntrance){
	this(name,noOfPeople,type,playArea,noOfTrees,walkAreaType,gymEquip,securityName);
	System.out.println("It is a constructor with name,int,string ,boolean , int boolean and boolean parameter----");
this.numOfEntrance=numOfEntrance;
}

}