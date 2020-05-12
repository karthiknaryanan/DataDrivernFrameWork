package fileWriting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingUsingBufferedWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location = "FileWritingUsingBufferedWriter.txt";
		String content = "FileWritingUsingBufferedWriter";
		FileWriter filewriter = new FileWriter(location);
		BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
		bufferedWriter.write(content);
		bufferedWriter.close();
	}

}
