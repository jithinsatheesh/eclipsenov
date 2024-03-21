package Testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepkg.Fbloginpage;

public class Fblogintest {
	WebDriver driver;
	  
	  @BeforeTest
	  public void setup() {
		  
		  driver=new ChromeDriver();
		  driver.get("https://www.facebook.com");
	  }
	  
	   @Test
	   public void testlogin()
	   {
		   Fbloginpage ob=new Fbloginpage(driver);
		   ob.setvalues("jithukattalan1709@gmail.com","jithin");
		   ob.login();
	   }
	}

