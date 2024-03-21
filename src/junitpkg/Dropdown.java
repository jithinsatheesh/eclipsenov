package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	ChromeDriver driver;
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	@Before
	public void setup()
	{
		driver =new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
public void dropdownbox()
    {
          WebElement day=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
          Select Daydetails=new Select(day);
          Daydetails.selectByValue("16");
          
          WebElement month=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
          Select Monthdetails=new Select(month);
          Monthdetails.selectByVisibleText("JUN");
          
          WebElement year=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
          Select Yeardetails=new Select(year);
          Yeardetails.selectByVisibleText("1998");
          
    }
  }



























