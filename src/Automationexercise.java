import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationexercise {
	ChromeDriver driver;
	String baseurl="https://automationexercise.com/";
	@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
		
		
	}
	@Test
	
	public void Operations() {
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("jithin");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("jithukattalan1705@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		driver.findElement(By.xpath(" //*[@id=\"id_gender1\"]")).click();	
		driver.findElement(By.xpath(" //*[@id=\"password\"]")).sendKeys("ZXCVBNMZXCVBNM1705");
		  WebElement day=driver.findElement(By.xpath("//*[@id=\"days\"] "));
		  Select daydetails=new Select (day);
		  daydetails.selectByValue("17");
		  WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"] "));
		  Select monthdetails=new Select(month);
	      monthdetails.selectByValue("5");
		  WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"] "));
		  Select yeardetails=new Select(year);
		  yeardetails.selectByValue("2002");
		  driver.findElement(By.xpath(" //*[@id=\"first_name\"]")).sendKeys("jithin");
		  driver.findElement(By.xpath(" //*[@id=\"last_name\"]")).sendKeys("satheesh");
		  driver.findElement(By.xpath("//*[@id=\"company\"] ")).sendKeys("JAI JAWAN pvtlimited");
		  driver.findElement(By.xpath("//*[@id=\"address1\"] ")).sendKeys("Vadakkechalla Muthalamada Govindhapuram (P.O) Palakkad 678507 ");
		  driver.findElement(By.xpath("//*[@id=\"address2\"] ")).sendKeys("Vadakkechalla Muthalamada Govindhapuram (P.O) Palakkad 678507  ");
		  WebElement country=driver.findElement(By.xpath("//*[@id=\"country\"] "));
		  Select countrydetails=new Select(country);
		  countrydetails.selectByValue("India");
		  driver.findElement(By.xpath("//*[@id=\"state\"] ")).sendKeys(" kerala");
		  driver.findElement(By.xpath("//*[@id=\"city\"] ")).sendKeys(" palakkad");
		  driver.findElement(By.xpath("//*[@id=\"zipcode\"] ")).sendKeys(" 678507");
		  driver.findElement(By.xpath(" //*[@id=\"mobile_number\"]")).sendKeys("7356349136");
		  driver.findElement(By.xpath(" //*[@id=\"form\"]/div/div/div/div[1]/form/button")).submit();

}
}
