package propertyFileReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("config.properties");
		Properties props = new Properties();
		props.load(fis);
		String property = props.getProperty("browser");
		System.out.println(property);
		

	}

}
