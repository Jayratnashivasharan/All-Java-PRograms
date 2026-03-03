class ConstructorOverloading{
	int id;
	String name;
	ConstructorOverloading (){
		System.out.println("this is default constructor");
	}
	ConstructorOverloading (int i,String n){
		id=i;
		name=n;
	}
	public static void main(String[] args) {
		ConstructorOverloading conover=new ConstructorOverloading();
		System.out.println("\nDefault Constructor values\n");
		System.out.println("ConstructorOverloading is:"+conover.id+"\nConstructorOverloading name:"+conover.name);
		System.out.println("\nParameterized Constructor values:\n");
		ConstructorOverloading conover2=new ConstructorOverloading(2,"Honey");
		System.out.println("\nConstructorOverloading Id:"+conover2.id+"\nConstructorOverloading Name:"+conover2.name);
	}
}