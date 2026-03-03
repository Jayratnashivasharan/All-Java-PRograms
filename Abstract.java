//we cannot create object of Abstract class...!
abstract class Jay{
	abstract void fun();
	
}	
class myJay extends Jay{
	 void fun(){
		System.out.println("Abstract class Program");
	}
}
class Abstract{
	public static void main(String[] args) {
		myJay m=new myJay();
		m.fun();
	}
}