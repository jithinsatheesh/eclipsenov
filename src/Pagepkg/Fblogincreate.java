package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fblogincreate {
WebDriver driver;
	
	By fbcreate=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By fbsignup=By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
	
	public Fblogincreate(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void click() {
		
		driver.findElement(fbcreate).click();
		driver.findElement(fbsignup).click();
	}


		   
         }



