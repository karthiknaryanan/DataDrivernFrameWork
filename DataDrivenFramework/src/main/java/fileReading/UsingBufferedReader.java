package fileReading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {
public static void main(String[] args) throws IOException {
	String location = "C:\\DataDrivenFramework\\FileWritingUsingBufferedWriter.txt";
	//String content = "FileWritingUsingFOS";
	
	FileReader fileReader = new FileReader(location);
	BufferedReader bR= new BufferedReader(fileReader);
	//System.out.println(bR.readLine());
	String content;
	while((content=bR.readLine())!=null) {
		
		System.out.println(content);
	}
}
}
