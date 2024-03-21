import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	ChromeDriver driver;
	String baseurl="https://www.instagram.com";
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void instagramlogin() 
	{
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("jithinnsatheesh");
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[2]/div/label/input")).sendKeys("jithu");
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[3]")).click();
	}

	@After
	public void teardown()
	{
		driver.quit();
	}
]
	

}



