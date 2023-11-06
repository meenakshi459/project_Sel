package week4.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sweet_nonmodelalert {

	public static void main(String[] args) {
		
		
		// To Launch the Chrome Driver
		
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.leafground.com/alert.xhtml");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				
		

	}

}
