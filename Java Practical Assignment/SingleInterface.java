interface one{
	public void disp1();
}
class two implements one{
	public void disp1(){
		System.out.println("In disp1");
	}
}
class SingleInterface{
	public static void main(String[] args) {
		two t=new two();
		t.disp1();
	}
}