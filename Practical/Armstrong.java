import java.util.Scanner;
public class Armstrong {
    public static void main(String as[]){
        int orgnum,rem,result=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        orgnum=n;
        while(orgnum !=0){
            rem=orgnum%10;
            result +=Math.pow(rem,n);
            orgnum/=10;
        }
        if(result==n)
        System.err.println(n+"number is armstrong. ");
        else
        System.err.println(n+"number is not armstrong.");
    }
}
