import java.util.Scanner;
class Armstrong {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int num=n;
		int sum=0;
		while(n>0){
			int r=n%10;
			sum+=(r*r*r);
			n/=10;
		}
		if(sum==num)
			System.out.println("Armstrong number"+num);
		else{
			System.out.println("Not Armstrong number"+num);
		}
	}
}