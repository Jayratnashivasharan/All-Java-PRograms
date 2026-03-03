public class ConstructorOverloading{
	int id;
	String name;
ConstructorOverloading(){
	System.out.println("Default Constructor");
}
ConstructorOverloading(int i,String n){
	id=i;
	name=n;
}
public static void main(String[] args) {
	ConstructorOverloading c=new ConstructorOverloading();
	System.out.println("\nDefault Constructor values:\n");
	System.out.println("ConstructorId:"+c.id+"\t"+"ConstructorName:"+c.name);
	System.out.println("\nParameterized Constructor values:\n");
	ConstructorOverloading c2=new ConstructorOverloading(02,"Jay");
	System.out.println("ConstructorId:"+c2.id+"\t"+"ConstructorName:"+c2.name);
	}
}