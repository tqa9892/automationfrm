package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class propertiesFileReader { 

	public static void main(String[] args) throws IOException {
	String location ="C:\\eclipse-workspace\\AutomationFrameWork\\src\\test\\resources\\configFile\\ref.properties" ;
FileInputStream is = new FileInputStream (location);
Properties pr = new Properties ();
	pr.load(is);
	System.out.println(pr.getProperty("browser"));
	}

}
