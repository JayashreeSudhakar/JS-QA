package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("home")).click();
		 
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        System.out.println( driver.findElementById("color").getCssValue("background-color"));

		 
		 //String buttonColor = driver.findElement(By.id("color")).getCssValue("background-color");
		 
	}

}
