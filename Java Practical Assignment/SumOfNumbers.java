import java.util.Scanner;
class SumOfNumbers{
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int num=n;
		int sum=0;
		while(n>0){
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum+"is Sum of Number");

	}
}