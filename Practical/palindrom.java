import java.util.Scanner;
public class palindrom {
    public static void main(String as[]){
        int r,sum=0,temp;
        Scanner s=new Scanner(System.in);
                System.out.println("Enter a number");

        int n=s.nextInt();
        temp=n;
        while (n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }    
        if(temp==sum)
        System.out.println("Palimdrom number");
        else
        System.err.println("Not a palindrom");
}
}
