package tw_portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvancedXpath {

	public static void main(String[] args) {
		//ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();		 
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();// to maximize the window
		String title = driver.getTitle(); // to get the Title of the Application launched
		System.out.println(title);
		driver.findElement(By.xpath("//form[@id='login']/p[1]/input")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//form[@id='login']/p[2]/input")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//form[@id='login']/p[3]/input")).click();
		driver.findElement(By.xpath("//div[@class='crmsfa']/div")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//ul[@class='shortcuts']/li[2]/a")).click();
		driver.findElement(By.xpath("//div[@class='fieldgroup']/div[2]/table/tbody/tr/td[2]/input")).sendKeys("New Company1");
		driver.findElement(By.xpath("//div[@class='fieldgroup']/div[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("Adam");
		driver.findElement(By.xpath("//div[@class='fieldgroup']/div[2]/table/tbody/tr[2]/td[4]/input")).sendKeys("Das");
		
		// Enter Drop DOwn values - 
		
		WebElement SDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec= new Select(SDD);
		sec.selectByIndex(1);
		
		// Enter Marketing DD
		
		WebElement MarkDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mdd= new Select(MarkDD);
		mdd.selectByIndex(3);
		
		driver.findElement(By.xpath("//div[@class='fieldgroup']/div[2]/table/tbody/tr[24]/td[2]/input")).click();
		
						
		//driver.close();

//////////////////////////////////////
		
		
	}

}
