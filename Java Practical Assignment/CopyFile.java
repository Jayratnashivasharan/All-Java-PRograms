import java.io.*;
class CopyFile{
	public static void main(String[] args) {
		try{
			FileInputStream fis=new FileInputStream("\\D:\\All Study\\java_code\\java\\Assignment\\hey.txt\\");
			FileOutputStream fos=new FileOutputStream("\\D:\\All Study\\java_code\\java\\Assignment\\hello.txt\\");
			int v;
			char ch;
			while(true){
				v=fis.read();
				if(v==-1){
					break;
				}
				ch=(char)v;
				fos.write(ch);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("hey Shreya");

	}
}