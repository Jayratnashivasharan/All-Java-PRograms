interface one{
	public void disp1();
}
interface two{
	public void disp2();
}
class Three implements two{
	public void disp1(){
		System.out.println("In disp1");
	}
	public void disp2(){
		System.out.println("In disp2");
	}
}
class MultipleInterface{
	public static void main(String[] args) {
		Three t=new Three();
		t.disp1();
		t.disp2();
	}
}