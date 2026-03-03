class cons{
	String name;
	int id;
cons(String name,int id){
	this.name=name;
	this.id=id;
}
cons (cons obj2){
	this.name=obj2.name;
	this.id=obj2.id;
}
}
class CopyConstructor{
	public static void main(String[] args) {
		System.out.println("First Object:");
		cons c1=new cons("Jay",01);
		System.out.println("ConstructorName:"+c1.name+"\t"+"ConstructorId:"+c1.id);
		System.out.println();
		cons c2=new cons("Shreya",02);
		System.out.println("ConstructorName:"+c2.name+"\t"+"ConstructorId:"+c2.id);
		System.out.println();
	}
}
