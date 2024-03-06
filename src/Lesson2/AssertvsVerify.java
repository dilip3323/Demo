package Lesson2;

import org.testng.annotations.Test;

import com.google.common.base.Verify;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


public class AssertvsVerify {
	
	WebDriver driver;

	String path = "C:\\Users\\dilip\\Downloads\\IEDriverServer\\IEDriverServer.exe";
	String expected_title = "this is new page";

	@BeforeSuite
	public void c()
	{
		driver = new InternetExplorerDriver();
		System.setProperty("webdriver.ie.driver","C:\\Users\\dilip\\Downloads\\IEDriverServer\\IEDriverServer.exe");
	}
	
  @Test
  public void f() {
	  String actual_title = driver.getTitle();
	  Assert.assertEquals(expected_title,actual_title);	  
  }
  @Test
  public void s()
  {
	  String actual_title = driver.getTitle();
	  Verify.verify(true, actual_title, expected_title);
  }
  
  
  @AfterClass
  public void afterClass() {
	  driver.close();
	  }

}
