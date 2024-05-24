import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadFile2 {

	public static void main(String[] args) {
		BufferedReader bf = null;
		StringBuilder sb = null;
		int countWord = 0;
		int countChar = 0;
		try {
				bf = new BufferedReader(new FileReader("C:\\Users\\D5\\testfile\\file.txt"));
				sb = new StringBuilder();
				String line = bf.readLine();
				while(line !=null) {
					String []lineArray = line.split(" ");
					countWord += lineArray.length;
					countChar += line.length();
					sb.append(line);
					sb.append(System.lineSeparator());
					line = bf.readLine();
					
					
					
				}
			}
			
		
		catch (Exception e) {
			System.out.println("There is an error");
		}
		System.out.println( sb.toString() );
		System.out.println( countWord );
		System.out.println( countChar);
		

	}

}
