import java.util.Scanner;
class Reverse{
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n>0){
			int r=n%10;
			System.out.println(r);
			n/=10;
		}
	}
}