import java.util.Scanner;
class Factorial{
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int f=1;
		for(int i=1;i<=n;i++){
			f *=i;
		}
		System.out.println("Factorial is:"+f);
	}
}