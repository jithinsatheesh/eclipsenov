package Testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepkg.Fblogincreate;

public class Fblogincreatetest {
	WebDriver driver;
	  
	  @BeforeTest
	  public void setup() {
		  
		  driver=new ChromeDriver();
		  driver.get("https://www.facebook.com");
	  }
	  
	  @Test
	   public void testlogin()
	   {
		   Fblogincreate ob=new Fblogincreate(driver);
		   ob.click();
		   
         }
}


