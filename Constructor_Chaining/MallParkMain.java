class MallParkMain{
public static void main(String[]values){
System.out.println("Running main method....");
Mall mall=new Mall();
System.out.println("default.");
System.out.println("######################################");

Mall mall2=new Mall("Smart Point","Thirthahalli",20);
System.out.println("It is a Constructor with THREE parameters......");
System.out.println("######################################");

Mall mall3=new Mall("Brilliant Mall","Shivamogga",5,true);
System.out.println("It is a Constructor with FOUR parameters......");
System.out.println("######################################");

Mall mall4=new Mall("Sacksyy","Kerala",50,false,"FunGames",5,"Venkyy");
System.out.println("It is a Constructor with SEVEN parameters......");

System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

Park obj=new Park();
System.out.println("Default Constructor.....");







}
}
