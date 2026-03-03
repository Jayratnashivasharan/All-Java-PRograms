import java.io.*;
interface a{
	void A();
}
interface b{
	void B();
}
class sample implements a,b{
	public void A(){
		System.out.println("Welcome : inside the method a1");

	}
	public void B(){
		System.out.println("Welcome : inside the method b1");
	}

}
class InterfaceMain{
	public static void main(String[] args) {
		sample obj=new sample();
		obj.A();
		obj.B();
	}
}