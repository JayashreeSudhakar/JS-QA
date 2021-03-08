package week4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/sortable/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		//Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement item1 = 	driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[1]"));
		WebElement item2 = 	driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[4]"));

		
		Actions builder = new Actions(driver);
		int x = item2.getLocation().getX();
		int y = item2.getLocation().getY();
		Thread.sleep(3000);
		builder.dragAndDropBy(item1, x,y).perform();
	}

}
//*[@id="sortable"]/li[1]
//*[@id="sortable"]/li[4]