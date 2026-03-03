interface a{
	void a1();
}
interface b{
	void b1():
}
class sample implements a,b{
	public void a1(){
		System.out.println("Welcome : inside the method a1");

	}
	public void b1(){
		System.out.println("Welcome : inside the method b1");
	}

}
class InterfaceMain{
	public static void main(String[] args) {
		sample obj=new sample();
		obj.a1();
		obj.b1();
	}
}