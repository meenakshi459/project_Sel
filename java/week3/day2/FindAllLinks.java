package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {

	public static void main(String[] args) {

		
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.javatpoint.com/software-testing-tools");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links are "+allLinks);
		
		//System.out.println(allLinks.get(2).getText());
		
		//for (WebElement each: allLinks) {
			
			//String text= each.getText();
			
			//System.out.println(text);
		//}
		
		
		
		
	}

}
