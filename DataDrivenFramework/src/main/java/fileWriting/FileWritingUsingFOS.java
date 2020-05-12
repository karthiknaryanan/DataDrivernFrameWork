package fileWriting;


import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingUsingFOS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location = "FileWritingUsingFOS.txt";
		String content = "FileWritingUsingFOS";
		
		FileOutputStream fos = new FileOutputStream(location);
		fos.write(content.getBytes());
		fos.close();

	}

}
