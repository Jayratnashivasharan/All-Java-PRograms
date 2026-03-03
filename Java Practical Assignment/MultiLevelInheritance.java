class Jay{
	public void disp1(){
		System.out.println("I am Jay");
	}
	
}
class Honey extends Jay{
	void disp2(){
		System.out.println("I am Honey");
	}
}
class Jayu extends Honey{
	void disp3(){
		System.out.println("I am Jayu");
	}

}
class MultiLevelInheritance{
	public static void main(String[] args) {
		Jayu j=new Jayu();
		j.disp1();
		j.disp2();
		j.disp3();
	}
}