package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;





public class Assertionpgm {
	ChromeDriver driver;
	String url="https//www.facebook.com/";
	@BeforeTest
	public void  setup()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}
       @Test
      public void titleverification()
{
    	   String exp="Facebok";
    	   String actualtitle=driver.getTitle();
           Assert.assertEquals(actualtitle,exp);
           System.out.println("test1");
}
}
