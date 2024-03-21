package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiplewindowhandler {
	ChromeDriver driver;
	@BeforeTest
	public void test()
	{
		driver = new ChromeDriver();
	}
	@Test
	public void windowhandler() 
	{
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		String parentwindow=driver.getWindowHandle();
		
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> allwindowhandles=driver.getWindowHandles(); 
		
		for(String handle: allwindowhandles) {
			if(! handle.equalsIgnoreCase(parentwindow)) {
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).sendKeys("sachin@gmail.com");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				driver.close();
				
			}
		}
		
	}

	}









