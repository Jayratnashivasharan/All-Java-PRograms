import java.io.*;
class ReadDataFromFile{
	public static void main(String[] args)throws Exception{
	
			FileReader fr=new FileReader("D:\\All Study\\java_code\\java\\Assignment\\Palindrom.java");
			int i;
			while((i=fr.read())!=-1)
			
			System.out.print((char)i);
		
	}
}
