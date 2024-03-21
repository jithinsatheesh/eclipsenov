package junitpkg;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmlpage {
	ChromeDriver driver;
	String baseurl="file:///D:/java/display.html";
	
	@Before
	public void load()
	{
		driver= new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
@Test

public void testing()
{
	WebElement ele=driver.findElement(By.xpath("//html//body/input[1]"));
	ele.click();
	
	Alert a=driver.switchTo().alert();
	String alerttext=a.getText();
	System.out.println("alert text ="+alerttext);
	a.accept();
	driver.findElement(By.name("firstname")).sendKeys("jithu");
	
	driver.findElement(By.name("lastname")).sendKeys( "kattalan");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}

}