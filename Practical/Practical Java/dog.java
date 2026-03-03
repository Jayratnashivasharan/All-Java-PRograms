class Animal{
	public void eat(){
		System.out.println("Animal is eating");
	}
}
class dog extends Animal{
	public static void main(String[] args) {
		dog d=new dog();
		d.eat();
		
	}
}