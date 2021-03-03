package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import week3.MergeLead;

public class Assignment1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		MergeLead.FindLeads(driver); 
		
		/*driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("iyswaryaharini@gmail.com");
		WebElement textbox = driver.findElement(By.xpath("//input[@value='Append ']"));
		textbox.sendKeys("My Text");
		textbox.sendKeys(Keys.TAB);
		//Get Text
		System.out.println(driver.findElement(By.name("username")).getAttribute("value")); 
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();*/
		driver.close();
		
		
		
	//Disabled - balance task
			
	}

}
