import java.util.Scanner;
class OddEven{
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%2==0)
			System.out.println(n+"Is a Even");
		else{
			System.out.println(n+"Is a Odd");
		}
	}
}