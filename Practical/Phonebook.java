import java.io.*;
import java.util.*;
public class Phonebook{
	public static void main(String[] args) {
		try{
			FileInputStream fis=new FileInputStream("D:\\All Study\\java_code\\java\\Practical Java\\Phonebook.java");
			Scanner s=new Scanner(fis).useDelimiter("\t");
			Hashtable<String,String> h=new Hashtable<String,String>();
			String[]strarray;
			String a,str;
			while(s.hasNext()){
				a=s.nextLine();
				strarray=a.split("\t");
				h.put(strarray[0],strarray[1]);
				System.out.println("hash table values are:"+strarray[0]+":"+strarray[1]);

			}
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the name as given in the phone book");
			str=s.nextLine();
			if(h.containsKey(str)){
				System.out.println("phone is"+h.get(str));

			}
			else{
				System.out.println("Name is not matched");
			}

		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}