package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xpath {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();// to maximize the window
		String title = driver.getTitle(); // to get the Title of the Application launched
		System.out.println(title);

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR"); // attribute bases Xpath
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");  // attribute bases Xpath
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click(); // attribute bases Xpath
		driver.findElement(By.xpath("//a [contains(text(),'CRM')]")).click();  //text bases Xpath
		driver.findElement(By.xpath("//a [contains(text(),'Leads')]")).click(); //text bases Xpath
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click(); //text bases Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TetLeaf"); // attribute bases Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Meenakshi"); // attribute bases Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("KS"); // attribute bases Xpath
		driver.findElement(By.xpath("//input[@name='submitButton']")).click(); // attribute bases Xpath

	}

}
