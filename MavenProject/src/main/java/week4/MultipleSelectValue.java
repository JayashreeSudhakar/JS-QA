package week4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleSelectValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
	 WebElement drop1 = (driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select/option[3]")));
		WebElement drop2 = (driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select/option[5]")));
		
		
		
				Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(drop1).click(drop2).keyUp(Keys.CONTROL).perform();
	}

}
