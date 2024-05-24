import java.io.File;

public class FolderCreation {

	public static void main(String[] args) {
		try {
		
			File testFile = new File("C:\\Users\\D5\\testfile");
			if(testFile.exists())
				System.out.println("This file is already exist");
			if(testFile.mkdir())
				System.out.println("This file is created");
		
			
		}
		catch (Exception e) {
			System.out.println("There is an error");
			
		}
	}

}
