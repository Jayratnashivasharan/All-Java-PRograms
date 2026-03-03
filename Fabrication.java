import java.util.*;
class Fabrication{
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int f1=0;
		int f2=1;
		System.out.println("\t"+f1+"\t"+f2);
		for (int i=1;i<=n-2;i++ ) {
			int f3=f1+f2;
			System.out.print("\t"+f3);
		f1=f2;
		f2=f3;
		}
	}
}