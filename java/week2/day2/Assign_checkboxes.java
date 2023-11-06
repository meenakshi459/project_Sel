package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class Assign_checkboxes {

	public static void main(String[] args) {
	 
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();// to maximize the window
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')])[1]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')])[2]")).click();
				
		String text = driver.findElement(By.xpath("//span[contains(@class,'ui-growl-title')]")).getText();
		System.out.println("Is both the Basic and Notification boxes Checked ? ="+" "+text);
		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')])[3]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')])[8]")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'ui-toggleswitch-slider')]")).click();
		String text1 = driver.findElement(By.xpath("//span[contains(@class,'ui-growl-title')]")).getText();
		System.out.println("Is the Toggle Checked ? ="+" "+text1);
		
		WebElement enb = driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox ui-widget')])[3]"));
		
		boolean enabled=enb.isEnabled();
		
		if (enabled) {
		
		System.out.println("Checkbox is Enabled");
		
		}
		
		else {
			
			System.out.println("Checkbox is Disabled");
			
		}
		
		// Select the Select Multiple Drop-down
		
		driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple-container')]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')])[12]")).click();
		String city = driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple-container')]")).getText();
		System.out.println("City Selected is="+" "+city);
		driver.findElement(By.xpath("//span[contains(@class,'ui-icon ui-icon-circle-close')]")).click();
		
		driver.close();
		
	
		

	}

}
