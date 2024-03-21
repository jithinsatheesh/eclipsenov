package junitpkg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcountfacebook {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void linkcount()
	{
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
	
	for (WebElement link : linklist) 
	{
        System.out.println("Link text: " + link.getText());
        System.out.println("Link href: " + link.getAttribute("href"));
	}}
	@After
	public void  teardown()
	{  
	driver.quit();
	}
}
  
