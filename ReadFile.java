import java.io.FileInputStream;

public class ReadFile {

	public static void main(String[] args) {
		try {
				FileInputStream starwords = new FileInputStream("C:\\Users\\D5\\testfile\\file.txt");
				int i = starwords.read();
				while(i !=-1) {
					System.out.println((char)i);
					i = starwords.read();
					
				}
		}	
		
		catch (Exception e) {
			System.out.println("There is an error");
		}
		}

}
