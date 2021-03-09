package week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");

		Actions actions = new Actions(driver);

		WebElement men = driver.findElement(By.linkText("Men's Fashion"));
		actions.moveToElement(men).perform();

		men.findElement(By.xpath("//*[@id=\"category6Data\"]/div[1]/div/div/p[7]/a/span")).click();

		
		 // WebElement loafers = driver.findElement(By.xpath("//div[@class='clearfix row-disc'][1]"));
		  //actions.moveToElement(loafers).perform();
		 String count = driver.findElement(By.className("category-count")).getText();
		  System.out.println("Total no of items" + count);
		  
			
	}

}
