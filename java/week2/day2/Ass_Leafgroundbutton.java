package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Point;


public class Ass_Leafgroundbutton {

	public static void main(String[] args) {
		
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String text = driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//span[text()='Click']")).click();
        String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		
		// TO check if the Button is Enabled OR Disabled
		
		WebElement enb = driver.findElement(By.xpath("//button[contains(@class,'ui-button-text-only ui-state-disabled')]"));
		
		 boolean enabled = enb.isEnabled();
	     if(enabled) 
	     
	     {
	    	 
		 System.out.println("it is not Disabled");
		 
			    }
	     
	       else 
	       
	       {
			      System.out.println("it is  Disabled");			
		}	
		
		// TO check the POSITION of the Button
	     
	     
		WebElement sub = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		
		Point point= sub.getLocation();
		
		System.out.println("Position for Submit button is="+" "+"X path="+" "+point.getX()+" "+"and "+"Y path="+" "+point.getY());
	
		
		// TO check the background color of the Button
		
		
		String color = driver.findElement(By.xpath("//button[contains(@class,'ui-button-text-icon-left ui-button-secondary mr-2 mb-2')]")).getCssValue("background-color");
				
		System.out.println("Button color="+" "+color);
		
		
		// TO check the SIZE of the Button
		
		WebElement button = driver.findElement(By.xpath("//button[contains(@class,'ui-corner-all ui-button-text-icon-right')]"));
		
		Dimension dim= button.getSize();
		
		System.out.println("Size of the Button is="+" "+dim);
		
		// Close the Browser
		
		driver.close();
		
		
		
		
		
		
}
	
	

   }