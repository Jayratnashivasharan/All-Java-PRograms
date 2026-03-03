import java.util.Scanner;
class Palindrom{
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int num=n,sum=0;
		while(n>0){
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(sum==num)
			System.out.println(num+"is a Palindrom");
		else{
			System.out.println(num+"is Not a Palindrom");
		}
	}
}