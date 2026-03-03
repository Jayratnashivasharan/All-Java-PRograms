import java.util.Scanner;
import java.io.*;

class InsertDataIntoFile{
	public static void main(String[] args) {
		try{
			System.out.println("Enter your text:");
			Scanner s=new Scanner(System.in);
			String str=s.nextLine();
			FileOutputStream fos=new FileOutputStream("\\D:\\All Study\\java_code\\Java\\Assignment\\Palindrom.java");
			for (int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				fos.write(ch);
			}
			fos.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}