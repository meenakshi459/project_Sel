package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class Assign_Button {

	public static void main(String[] args) 
{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Select Radio Button "Edge"
		driver.findElement(By.xpath("(//div[contains(@class,'ui-radiobutton-box ui-widget ui-corner-all')])[15]")).click();
		
		// Check Default selected Radio button
		
		String text = driver.findElement(By.xpath("(//label[contains(text(),'Safari')])[2]")).getText();
		System.out.println("Default Selected Radio Button is="+" "+text);
		
		
		WebElement select = driver.findElement(By.xpath("(//div[contains(@class,'ui-radiobutton-box ui-widget ui-corner-all')])[24]"));
		
		boolean selected= select.isSelected();
		
		if (selected) {
			
			System.out.println("Age 21-40 is alreadry Selected");
		}
			
			else {
				
				System.out.println("Button is not Selected, Kindly select ");
			}
		
		driver.close();
		
			}
		
		
	}


