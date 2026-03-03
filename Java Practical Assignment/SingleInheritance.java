class Jay{
	public void display1(){
		System.out.println("I am jay");
	}
}
class Honey extends Jay{
	 void display2(){
		System.out.println("I am Honey");
	}
}
class SingleInheritance{
	public static void main(String[] args) {
		Honey h=new Honey();
		h.display1();
		h.display2();
	}
}
