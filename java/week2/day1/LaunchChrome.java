package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;


public class LaunchChrome {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();// to maximize the window
		String title = driver.getTitle(); // to get the Title of the Application launched
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TetLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Meenakshi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KS");
		
		//selecting Dropdown "Sourcing" values
		
		
        WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select sec = new Select(sourceDD);
        sec.selectByIndex(1);
        
      //selecting Dropdown "Industry" values
        
        WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
        Select indus = new Select(industryDD);
        indus.selectByVisibleText("Finance");
        
      //selecting Dropdown "marketingCampaignId" values
        
        WebElement marketDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select mark = new Select(marketDD);
        mark.selectByValue("9001");
        driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Company Name is:"+" "+text);
		driver.close(); // to close the application

		
	}

}
