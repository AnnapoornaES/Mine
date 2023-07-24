class Helmet{
   static String brand="Vega";
   static String type;//Full-Face Helmet
   int totalNum;
   boolean bulletProof;
   
   Helmet(){
	   System.out.println("It is Default Constructor......");
	   this.totalNum=totalNum;
	   bulletProof=bulletProof;
   }
   static void HelmetStatic(){
	   System.out.println("It is a Static method......");
	   String type="Full-Face Helmet";
	   System.out.println(brand);
	   System.out.println("type is:"+type);
   }
   void HelmetInstance()
   {
	   System.out.println("It is a Instance method......");
	   totalNum=5;
	   System.out.println("totalNum is:"+totalNum);
	   System.out.println("Brand is:"+brand);
       System.out.println("IS it bulletProof :"+bulletProof);
   }
   Helmet(String brand,int totalNum,boolean bulletProof){
	   	   System.out.println("It is  Constructor with three parameters.... .....");
this.brand=brand;
this.totalNum=totalNum;
this.bulletProof=bulletProof;
   }  
}