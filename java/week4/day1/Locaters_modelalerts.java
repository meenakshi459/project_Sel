package week4.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Locaters_modelalerts {

	public static void main(String[] args) {
		
		// To Launch the Chrome Driver
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// To Click the Alert Button
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		// To Switch to Alert Box
		
		Alert Promptalert = driver.switchTo().alert();
		
				
		// To get the Alert Message from the AlertBox
		
		String text=Promptalert.getText();
		System.out.println("Alert Message is: "+" "+text);
		
		// to enter values into alert
		
		   Promptalert.sendKeys("Hi TestLeaf");
		
		// To dismiss/cancel the alert
		
		//Promptalert.dismiss();
		
		// To accept the Alert
		
		 Promptalert.accept();
		
		// To get the Message after Alert is responded
		
		String text2 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text2);
		
		// To close the Browser
		
		driver.close();
		
		
		
		
		
	}

}
