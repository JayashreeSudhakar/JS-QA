package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WeeklyAssignmentDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();

		Select drpindex = new Select(driver.findElement(By.xpath("//*[@id=\"dropdown1\"]")));
		drpindex.selectByIndex(3);

		Select drptext = new Select(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/select")));
		drptext.selectByVisibleText("Loadrunner");

		Select drpvalue = new Select(driver.findElement(By.xpath("//*[@id=\"dropdown3\"]")));
		drpvalue.selectByValue("3");

		WebElement drpindex1 = (driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")));
		drpindex1.sendKeys("UFT/QTP");

		/*
		 * Select drpsel = new Select(driver.findElement(By.xpath("")));
		 * drpsel.selectByVisibleText("Selenium");
		 */

//

	}
}
