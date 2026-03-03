import java.util.Scanner;
class CompareThreeValue{
	public static void main(String[] args) {
		System.out.println("Enter a three numbers:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b&&a>c)
			System.out.println(a+" is Greated");
		if(b>a&&b>c)
			System.out.println(b+" is Greated");
		else{
			System.out.println(c+" is Greated");
		}

	}
}