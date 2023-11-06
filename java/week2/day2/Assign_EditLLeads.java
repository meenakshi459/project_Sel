package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class Assign_EditLLeads {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();// to maximize the window
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String title = driver.getTitle(); // to get the Title of the Application launched
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Company1");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Rhythm");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("A");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Rhythm Adam");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Training");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Automation Trainings");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("abc@gmail.com");
		
		// State Drop-down
		
		WebElement statedd = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec = new Select(statedd);
	    sec.selectByVisibleText("Alaska");
	    
	    // Create Leads
	    
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    //Getting  text Company Name
	    
	    String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	    System.out.println("My Company Name is:"+" "+text);
	    
	    // Click Edit Leads
	    
	    driver.findElement(By.xpath("//a[text()='Edit']")).click();
	    
	    // clearing the text from Description Text boxes
	    
	    driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
	    
	    
	    // Filling Important Notes field
	    
	    driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Filling Imp Notes");
	    
	    // Update Leads
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    
	    // getting the Title of Page
	    
	   String title2 = driver.getTitle();
	    System.out.println(title2);
	    
	    //Closing the Browser
	    
	    driver.close();
	    
	    
	    
	    
	    
		
		
		
		
		
		
	

	}

}
