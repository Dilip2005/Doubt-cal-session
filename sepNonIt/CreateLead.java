package sepNonIt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//parent to child xpath
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("DemoSalesManager");
		
		//eldersibling to youngersibling
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");
		
		//grandparen to grandchild and indexbased
		driver.findElement(By.xpath("(//form[@id='login']//input)[3]")).click();
		
		//partial text based used
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		
		//textbased xpath
		
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	
	//c to p  xpath
	driver.findElement(By.xpath("//a[text()='Create Lead']/parent::li")).click();
	
	//collection based xpath
	driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("testleaf");
	
	//attribute based xpath
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Dilip");
	
	Thread.sleep(3000);
	//child to parent
	
	driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Kumar");
	
	
	//partial attribute xpath
	driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		

	}

}
