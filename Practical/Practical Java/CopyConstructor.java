import java.io.*;
class CopyCons{
	String name;
	int id;
	CopyCons(String name, int id){
		this.name=name;
		this.id=id;
	}

CopyCons(CopyCons obj2){
	this.name=obj2.name;
	this.id=obj2.id;
	}
}
class CopyConstructor{
	public static void main(String[] args) {
		System.out.println("First Object");
		CopyCons copycons1=new CopyCons("Jay",1);
		System.out.println("CopyconsName:"+copycons1.name+" "+"CopyConsid:"+copycons1.id);
		System.out.println();
		CopyCons copycons2=new CopyCons(copycons1);
		System.out.println("Copy Constructor used second Object");
		System.out.println("CopyconsName:"+copycons2.name+" "+"CopyConsid:"+copycons2.id);
	}
}