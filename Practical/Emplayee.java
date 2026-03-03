//why prtogram having errors in compilation errors?
//Having 3 errors in this program...!
class Person1{
	int id;
	String name;
}
 void set_Person(int id,String name){
	try{
		this.id=id;
		this.name=name;
	}
	catch(Exception ex){
		ex.printStrackTrace();
	}
 void disp_Person(){
	System.out.print(id+"\t"+name+"\t");
}
}
class Emplayee extends Person1{
	int sal;
	String desgn;
	public void set_Emp(int id,String name,String desgn,int sal){
		try{
			set_Person(id,name);
			this.desgn=desgn;
			this.sal=sal;
				
		}catch(Exception ex){
			ex.printStrackTrace();
		}
	}
	public void disp_Emp(){
		disp_Person();
		System.out.print(desgn+"\t"+sal);
	}
	public static void main(String[] args) {
		Emplayee e1=new Emplayee();
		e1.set_Emp(1001,"Jay","JS",20000);
		e1.disp_Emp();
	}
}