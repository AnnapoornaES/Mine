class A{
static String name="Jimmy";  //It is static variable
int num;     //It is an instance variable

public static void main(String [] args){
 A.Dog();
A.Cat("Ruby");
 void Dog();{
int age=3; //it is a local variable
System.out.println("Dog age is "+age);

}

void Cat(String name){

System.out.println("Cat name is:"+name);
}
//here String name is a parameter


}

}
