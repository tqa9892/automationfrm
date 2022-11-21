package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.basebrowser;
import utilities.readXlsxdata;

public class firstTestCase extends basebrowser {
	
	@Test(dataProviderClass=readXlsxdata.class, dataProvider="dvttest")
public static void signup (String user, String pass) {
		System.out.println("starting the test afw");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath(prt.getProperty("signinButton"))).click(); // Externalizing locator by reading xpath from properties file
	driver.findElement(By.xpath(prt.getProperty("emailbox"))).sendKeys(user);
	driver.findElement(By.xpath(prt.getProperty("nextbutton"))).click();
	driver.findElement(By.xpath(prt.getProperty("passw"))).sendKeys(pass);
	driver.findElement(By.xpath(prt.getProperty("login"))).click();
	}
	
//	@DataProvider(name="tdata")
//	public Object [][] testdata (){
//		                                //here we used data from same class
//	return new Object [][] {
//		{ "taqldksjs@gmail.com","pass123"},
//		{"hsdhdkj@hfa}","kjhasdkjh"},
//		{"tqa9892@gmail.com","Rpn@2018"}
//		
//	};
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
//    WebElement cc =driver.findElement(By.xpath("//select[@id='country']"));
//  Select ss = new Select(cc);
//   ss.selectByVisibleText("United States");
//   
//   WebElement city = driver.findElement(By.xpath("//select[@id='country_state']"));
//   ss.selectByVisibleText("Nevada");
//
//   WebElement checkbx = driver.findElement(By.xpath("//input[@id='tos']"));
//   Actions ac = new Actions (driver);
//   ac.moveToElement(checkbx).perform();
//   
//   driver.findElement(By.xpath("//input[@id='tos']")).click();
//   driver.findElement(By.xpath("//input[@id='tos']")).isSelected();
//   
//   driver.findElement(By.xpath("//input[@id='za-signup-btn']")).click();
//   System.out.println("sign is successful automated");
   
   
   
	
}
