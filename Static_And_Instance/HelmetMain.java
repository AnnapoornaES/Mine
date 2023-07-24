class HelmetMain{
public static void main(String[]values){
System.out.println("It is main method...............");


Helmet obj=new Helmet();
obj.totalNum=4;
obj.bulletProof=true;
System.out.println("Total Number of helmets:"+obj.totalNum);
System.out.println(" Is helmet is bulletProof:"+obj.bulletProof);

Helmet.HelmetStatic();
obj.HelmetInstance();

Helmet obj2=new Helmet("Honda",8,false);
obj2.HelmetInstance();
Helmet.HelmetStatic();

}

}