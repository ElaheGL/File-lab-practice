import java.io.File;

public class FileCreation {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\D5\\testfile\\file.txt");
			if (file.createNewFile())
				System.out.println("File is created");
			else
				System.out.println("File is already exist");
			
		}
		catch (Exception e) {
			System.out.println("There is an Error");
		}
		

	}

}
