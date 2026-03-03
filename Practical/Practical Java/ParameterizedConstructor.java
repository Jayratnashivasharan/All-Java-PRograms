import java.io.*;
class paraconstru{
	String name;
	int id;
	paraconstru(String name,int id){
		this.name=name;
		this.id=id;
	}
		
}
class ParameterizedConstructor{
	public static void main(String[] args) {
		paraconstru para=new paraconstru("Jay",1);
		System.out.println("Constructor Name:"+para.name+" "+"Constructor Id:"+para.id);
	}
}