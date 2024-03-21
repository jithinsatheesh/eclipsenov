package junitpkg;

    import java.util.List;

import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Janasyaweb {
		ChromeDriver driver;
		String baseurl="https://www.janasya.com";
	@Before
	public void loadpage() 
	{
		driver= new ChromeDriver();
		driver.get(baseurl);
		}
	@Test
	public void link()
	{
		WebElement search=driver.findElement(By.id("Search-In-Modal"));
				search.sendKeys("sarees");
		search.submit();
		List<WebElement> linklist =driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
	}
	}

