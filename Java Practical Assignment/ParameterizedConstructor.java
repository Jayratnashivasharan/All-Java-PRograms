class Constructor{
	String name;
	int id;
	Constructor(String name,int id){
		this.name=name;
		this.id=id;
	}
}
class ParameterizedConstructor{
	public static void main(String[] args) {
		Constructor c=new Constructor("jay",01);
		System.out.println("ConstructorName:"+c.name+"\nConstructorId:"+c.id);
	}
}