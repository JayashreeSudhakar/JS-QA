package week3;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//LAUNCH THE BROWSER
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//MAXIMIZE THE WINDOW
		driver.manage().window().maximize();
		//GO TO THE URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		// ENTER USER NAME AND PASSWORD
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//CLICK LOGIN BUTTON		
		driver.findElement(By.className("decorativeSubmit")).click();
		//CLICK CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//CLICK LEADS
		driver.findElement(By.linkText("Leads")).click();
		
		//FindLeads(driver);
		
		//MERGE LEADS		
		driver.findElement(By.linkText("Merge Leads")).click();
		
		
		String firstWindowHandle= driver.getWindowHandle();
		System.out.println(firstWindowHandle);
		System.out.println("*************************");
				
		//CLICK ON ICON NEAR FROM LEAD
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
	Set<String> allWindowHandles =	driver.getWindowHandles();
	for(String eachHandle :allWindowHandles) {
		System.out.println(eachHandle);
	}
	List<String> listHandles = new ArrayList<String>(allWindowHandles);
	
	//MOVE TO FIRST WINDOW
driver.switchTo().window(listHandles.get(1));
String secondTitle = driver.getTitle();
System.out.println(secondTitle);
//ENTER LEAD ID
driver.findElement(By.name("id")).sendKeys("10085");

//CLICK FIND LEADS BUTTON
driver.findElement(By.xpath("//*[@id=\"ext-gen114\"]")).click();
Thread.sleep(5000);

//12 CLICK FIRST RESULTING LEAD 
driver.findElement(By.linkText("Lakshmipathy")).click();
Thread.sleep(3000);

//Switch back to primary window
driver.switchTo().window(firstWindowHandle);

//Click on Icon near To Lead

//driver.findElement(By.xpath("//*[@id=\"ext-gen603\"]")).click();
//driver.findElement(By.id("ComboBox_partyIdTo")).click();
driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

//Move to new window
Set<String> allWindowHandles1 =	driver.getWindowHandles();
for(String eachHandle :allWindowHandles1) {
	System.out.println(eachHandle);
}
List<String> listHandles1 = new ArrayList<String>(allWindowHandles1);

//MOVE TO FIRST WINDOW

driver.switchTo().window(listHandles1.get(1));
String secondTitle1 = driver.getTitle();
System.out.println(secondTitle1);
Thread.sleep(3000);


driver.findElement(By.name("id")).sendKeys("10087");
driver.findElement(By.xpath("//*[@id=\"ext-gen114\"]")).click();
Thread.sleep(3000);
driver.findElement(By.linkText("Sow65")).click();
driver.switchTo().window(firstWindowHandle);




driver.findElement(By.linkText("Merge")).click();
Alert alert = driver.switchTo().alert();
alert.accept();  
Thread.sleep(3000);
//************************ Error

//driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Find Leads")).click();

driver.findElement(By.name("id")).sendKeys("10085");

driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
Thread.sleep(5000);
driver.close();

		}

	

}

				
		
		
		

	