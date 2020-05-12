package fileWriting;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritingUsingFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location = "FileWritingUsingFileWriter.txt";
		String content = "FileWritingUsingFileWriter";

		FileWriter filewriter = new FileWriter(location);

		filewriter.write(content);
		filewriter.close();

	}

}
