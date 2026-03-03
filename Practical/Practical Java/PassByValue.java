import java.io.*;
class PassByValue{
	static int add(int x,int y){
		{
			x+=y;
			return x;
		}
	} 
	public static void main(String[] args) {
		int a=1,b=2;
		add(a,b);
		System.out.println("After the add fuction a="+a);
		System.out.println("After the add fuction b="+b);


	}
}