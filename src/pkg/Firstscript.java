package pkg;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
			String exp="Google";
			String actualtitle=driver.getTitle();
			if(exp.equals(actualtitle))
			{
				System.out.println("correct");
			}
			else
			{
				System.out.println("wrong");
			}
			driver.quit();
				

	}

}
