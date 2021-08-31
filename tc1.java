package mavenproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Launch the URL
		driver.get("http://iarchtaps.com:8080/opentaps/control/main");
		driver.manage().window().maximize();
		
		//Provide Username and Password and click Login
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//Click  CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		// First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Testfirstname");
		// Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("testlastname");
		// Choose Source
		WebElement srce = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourcedrop = new Select(srce);
		sourcedrop.selectByIndex(2);
		
		// Choosee Marketing Campaign
		WebElement mrkt = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mrktcmp = new Select(mrkt);
		mrktcmp.selectByValue("CATRQ_CAMPAIGNS");
		
		//Enter Phone number
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("3498394");
		//email address
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test.sds@gmail.com");
		//Click Create lead
		driver.findElement(By.className("smallSubmit")).click();
		//Capture the Lead ID
		//System.out.println(driver.findElement(By.xpath("//input[@name='leadPartyId']")).getText());
		//Close the browser
		driver.close();
		
		
	}

}
