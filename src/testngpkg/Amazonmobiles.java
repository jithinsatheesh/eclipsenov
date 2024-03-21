package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonmobiles {
	ChromeDriver driver;
	@BeforeTest
	public void test()
	{
		driver = new ChromeDriver();
	}
	@Test
	public void Search() throws Exception 
	{
		String parentwindow=driver.getWindowHandle();
		driver.get("https://amazon.in/");
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		String expectedtitle="Amazon.in:mobile phones";
		String actualtitle=driver.getTitle();
		
		if(expectedtitle.equals(actualtitle)) {
			System.out.println("pass");
		}else
		{
			System.out.println("fail");
		}
		
		Set<String> multiplewindow=driver.getWindowHandles();
		for(String secondtab: multiplewindow)
		{
			if(!secondtab.equalsIgnoreCase(parentwindow)) 
			{
				driver.switchTo().window(secondtab);
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
				driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
			
			}
		}
	
		
		
	}}

 
