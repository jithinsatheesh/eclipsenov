package testngpkg;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RedifftestNG {
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@BeforeTest
	public void test()

	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void loadurl()
	 {
	  driver.get(baseurl);
	 }
	 @Test(priority=1)
	 public void titleverification()
	 {
	  String exp="Rediffmail";
	     String actual=driver.getTitle();
	     System.out.println(actual);
	     if(actual.equals(exp))
	     {
	      System.out.println("pass");
	     }
	     else
	     {
	      System.out.println("fail");
	     }
	 }
	     @Test(priority=3)
	     public void logoverification() 
	     {
	       boolean logo= driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
	       
	       
	       if(logo)
	       {
	        System.out.println("logo is displayed");
	       }
	       else
	       {
	        System.out.println("logo is not displayed");
	       }
	     }
	     
	        @Test(priority=5)
	        public void contentverification()
	        {
	        	WebElement titile= driver.findElement(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[3]/td[1]"));
	        String src=driver.getPageSource();
	        String p ="Full Name";
	        if(src.contains(p))
	        {
	        	System.out.println("test is present");
	        }
	        else
	        {
	        	System.out.println("test is not present");
	        }
	        }
	        //}
	        @Test(priority=2)
	        public void buttoneneabled()
	        {
	        	boolean button=driver.findElement(By.xpath("//*[@id=\"Register\"]")).isEnabled();
	        	if (button)
	        	{
	        		System.out.println("button is enabled");
	        	}
	        	else
	        	{
	        		System.out.println("button is not enabled");
	        	}
	        }
	        @Test(priority=4)
	        public void buttontextverification()
	        {
	        	String buttontext=driver.findElement(By.xpath("//*[@id=\"Register\"]")).getAttribute("value");
	        	String st="Create my account >>";
	        	if(buttontext.contains(st))
	        	{
	        		System.out.println("pass");
	        	}
	        	else
	        	{
	        		System.out.println("fail");
	        	}
	        }
	        
	        
	     

}

