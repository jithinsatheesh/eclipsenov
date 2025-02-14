package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Faceebook {
	ChromeDriver driver;
	String url="https//www.facebook.com/";
	@BeforeTest
	public void  setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
	@Parameters({"username","password"})
	@Test
	public void test(String username,String password)
	{
		System.out.println("username="+password);
		System.out.println("password="+password);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
	}
	

}
