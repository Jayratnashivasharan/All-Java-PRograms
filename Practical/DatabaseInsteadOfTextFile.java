import javaio.IOException;
import java.nio.file.Files;
import java.nio.file.path;
class DatabaseInsteadOfTextFile{
	public static void main(String[] args) throws IOException  {
		String text="Hey jay\nHello Honey!";
		path fileName=Path.of("D:\\All Study\\java_code\\java\\Practical Java\\DatabaseInsteadOfTextFile.txt");
		Files.writeString(fileName,text);
		String file_content=Files.readString(fileName);
		System.out.println(file_content);
	}
}