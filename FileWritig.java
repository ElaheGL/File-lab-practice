import java.io.FileOutputStream;

public class FileWritig {

	public static void main(String[] args) {
		String source = "this is a test for writing in file";
		try {
				FileOutputStream fw = new FileOutputStream("C:\\Users\\D5\\testfile\\file.txt");
				byte []temp = source.getBytes();
				fw.write(temp);
				fw.close();
			
		}
		catch (Exception e) {
			System.out.println("There is an error");
					}

	}

}
