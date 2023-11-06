package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
    
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// To get the Title of Current Window
        String ptitle = driver.getTitle();
        System.out.println("Window Title is: "+" "+ptitle);
        
    	// To get the Address of Current Window
        String windowHandle = driver.getWindowHandle();
        System.out.println("Window Address is: "+" "+windowHandle);
        
        // To switch to child window
        
        driver.findElement(By.xpath("//span[text()='Open']")).click();
        
        Set<String> windowHandles = driver.getWindowHandles();
        
        for (String eachWindow : windowHandles) {
        	
        	System.out.println(eachWindow);
        	
        	// Convert Set into List
        	
        	
        	List<String> listofHandles = new ArrayList<>(windowHandles);
        	
        	String childhandle = listofHandles.get(1);
        	
        	driver.switchTo().window(childhandle);
        	
        	String ctitle = driver.getTitle();
        	System.out.println(ctitle);
        	
        	
        	
        }
        
        

	}

	
}

