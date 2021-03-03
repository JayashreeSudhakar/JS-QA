package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WeeklyAssignmentImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		
		
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leafground.com/pages/Image.html");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img")).click();
		 
		// driver.navigate().back();
		 
	}

}
