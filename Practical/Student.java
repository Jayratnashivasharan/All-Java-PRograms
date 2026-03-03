//Using this keyword in Constructor Overloading:
class Student{
	int id,passoutYear;
	String name,contactNo,CollegeName;
Student (String contactNo ,String CollegeName,int passoutYear){
	this.contactNo=contactNo;
	this.CollegeName=CollegeName;
	this.passoutYear=passoutYear;
}
Student (int id,String name){
	this("9611260112","Bharti vidyapeeth",2023);
	this.id=id;
	this.name=name;

}
public static void main(String[] args) {
	Student s=new Student(101,"Jay");
	System.out.println("Printing Student information:\n");
	System.out.println("\nName:"+s.name+" "+"\nId:"+s.id+"\nContact No:"+s.contactNo+"\nCollege Name:"+s.CollegeName+"\npassout Year:"+s.passoutYear);

}
}