package sepNonIt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//id locator used
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//name locator used
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		//class locator used
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//linktext locator used
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Dilip");
		Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell')]/a")).click();
		 
driver.findElement(By.linkText("Edit")).click();	

driver.findElement(By.id("updateLeadForm_companyName")).clear();
Thread.sleep(2000);
driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("testleaf");

//driver.findElement(By.name("submitButton")).click();

String newCompany = "testleaf";
String chgCompany = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
System.out.println(chgCompany);
if(chgCompany.contains(newCompany)) {
	System.out.println("Edit Succesfull!");
}
}
}