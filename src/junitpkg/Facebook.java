package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void fblogin() 
	{
		driver.findElement(By.id("email")).sendKeys("drisyasheebababuraj@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.name("login")).click();
	}

	@After
	public void teardown()
	{
		driver.quit();
	}
	

}
