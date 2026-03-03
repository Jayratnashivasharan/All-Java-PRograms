class ArrayOfObject{
	public static void main(String[] args) {
		Student []arr;
		arr=new Student[2];
		arr[0]=new Student();
		arr[1]=new Student();
		arr[0].setData(01,"Jay");
		arr[1].setData(02,"shreya");
		System.out.println("Student data in arr 0:");
		arr[0].Display();
		System.out.println("Student data in arr 1:");
		arr[1].Display();

	}
}
class Student {
	public int id;
	public String name;
	public void setData(int id,String name){
		this.id=id;
		this.name=name;
	}
	public void Display(){
		System.out.println("Student id is="+id+" "+"Student name is="+name);
		System.out.println();
	}
}