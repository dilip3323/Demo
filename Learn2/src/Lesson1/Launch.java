package Lesson1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\dilip\\Downloads\\IEDriverServer\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();

		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		//Alert alert = driver.switchTo().alert();	
		//alert.dismiss();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("searchmyword");
		
		WebElement btn = driver.findElement(By.xpath("//input[@name='btnK']"));
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", btn);

	}

}
