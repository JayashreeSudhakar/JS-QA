package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		
		
		 ChromeDriver driver = new ChromeDriver();

		 driver.get("https://acme-test.uipath.com/login");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("leaf@12");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 String title =driver.getTitle();
		 System.out.println(title);
		 
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			
            driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();


	driver.close();
	}

}
