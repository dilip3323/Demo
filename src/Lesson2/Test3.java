package Lesson2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;


public class Test3 {
	
	WebDriver driver;
	String path = "C:\\Users\\dilip\\Downloads\\IEDriverServer\\IEDriverServer.exe";
	String expected_title = "this is new page";

	@BeforeTest
	public void c()
	{
		System.setProperty("webdriver.ie.driver","C:\\Users\\dilip\\Downloads\\IEDriverServer\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();

	}
	@BeforeMethod()
	
	public void launchbrowser()
	{
		driver.get("https://stackoverflow.com/questions/40647826/why-cannot-system-setproperty-be-used-at-class-level");
	
	}
	
	
  @Test
  public void f() {

	  String actual_title = driver.getTitle();
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(expected_title,actual_title)	;  
	  System.out.println("line after assert exp");
  }
  
  @Test
  public void s()
  {
	  String actual_title = driver.getTitle();
	  Verify.verify(true, actual_title, expected_title);
  }
  
  @AfterTest
 public void afterClass() {
	driver.quit();
	System.out.println("method has executed");
  }
}
