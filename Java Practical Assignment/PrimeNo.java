import java.util.*;
class PrimeNo{
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int flag=0;
		int i=2;
		while(i<n){
			if(n%i==0){
				flag=1;
				break;
			 }  
			i++;
		}
			if(flag==1)
				System.out.println("Composite!");
			
			else{
				System.out.println("Prime!");
			}

			

	}	
}	
