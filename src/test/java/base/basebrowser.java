package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest; 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basebrowser {
	public static WebDriver driver;
	public static Properties prt = new Properties ();
	public static FileInputStream fis ;
	public static FileInputStream loc ;
	@BeforeMethod                  //here if we do 1 test which has more method then we change it to Before&AfterMethod or if we want to run  
	public void setupbrowser () throws IOException {  //or if we run more test cases we use BeforeTest/AfterTest
		
		if (driver==null) {
			// System.out.println(System.getProperty("user.dir"));
		FileInputStream fis = new FileInputStream (System.getProperty("user.dir")+"\\src\\test\\resources\\configFile\\ref.properties");
		prt.load(fis);
		FileInputStream loc = new FileInputStream (System.getProperty("user.dir")+"\\src\\test\\resources\\configFile\\locators.properties");
prt.load(loc);
		
		
		}
		if (prt.getProperty("browser").equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver ();
			driver.get(prt.getProperty("url"));
		}
		else if (prt.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver ();
			driver.get(prt.getProperty("url"));
		}
		
		else if (prt.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver ();
			driver.get(prt.getProperty("url"));
		}
	}
	@AfterMethod
	public void tearup () {
	driver.close();
	System.out.println("tear down successful");
	}

}
