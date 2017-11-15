package testFile;
import java.io.*;

public class FileTest {
	
	public static void main(String[] args) {
		
		File file = new File("arquivo.txt");
		try {
			System.out.println(file.createNewFile());
			boolean exist = file.exists();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

