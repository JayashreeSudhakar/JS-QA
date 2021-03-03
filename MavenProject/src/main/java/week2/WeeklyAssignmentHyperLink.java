package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WeeklyAssignmentHyperLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		driver.findElement(By.linkText("Go to Home Page")).click();
		 driver.navigate().back();		
		driver.findElementByLinkText("Find where am supposed to go without clicking me?").click();	

		driver.navigate().back();		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		//System.out.println(driver.findElements(By.tagName("a"))); 
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The number of links is " + links.size());
		//driver.close();
		
		
		
	}

}
