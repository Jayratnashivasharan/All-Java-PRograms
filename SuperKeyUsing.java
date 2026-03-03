//why ? compilation 1 error occurs?
class A{
	int i;
	public A(int r){
		i=r;
		System.out.println(i);
	}
	class B extends A{
		int j;
		public B(int p,int q){
			super(p);
			j=q;
			System.out.println(j);
		}
	}
	class SuperKeyUsing{
		public static void main(String[] args) {
			B obj=new B(10,20);
		}
	}
}