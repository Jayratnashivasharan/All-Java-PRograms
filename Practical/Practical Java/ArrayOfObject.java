class ArrayOfObject{
	public static void main(String[] args) {
		Student[] arr;
		arr=new Student[2];
		arr[0]=new Student(01,"jay");
		arr[1]=new Student(02,"honey");
		System.out.println("Student data in student arr 0:");
			arr[0].Display();
		System.out.println("Student data in student arr 1:");
		arr[1].Display();
	}
}
class Student {
	public int id;
	public String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;

	}
	public void Display(){
		System.out.println("Student id is:"+id+" "+"and Student name is:"+name);
		System.out.println();
	}
	}