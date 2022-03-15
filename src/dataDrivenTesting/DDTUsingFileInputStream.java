package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DDTUsingFileInputStream {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
				
		Properties p = new Properties();
		
		p.load(new FileInputStream("./data.properties")); //DDT using property file
		String url = p.getProperty("url");
		System.out.println(url);

	}

}
