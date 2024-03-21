package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Longdispaly {
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void linkvalidation()
	{
		boolean logo =driver.findElement(By.xpath("//div[@id=\"wrapper\"]/table/tbody/tr/td[1]/img")).isDisplayed();
		if(logo)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
	}

}
