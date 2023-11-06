package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignList {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.hp.com/in-en/shop/laptops-tablets/business-laptops/zbook-laptops.html?processorfamily=11th-generation-intel%C2%AE-core%E2%84%A2-i7-processor+12th-generation-intel%C2%AE-core%E2%84%A2-i5-processor+12th-generation-intel%C2%AE-core%E2%84%A2-i7-processor+12th-generation-intel%C2%AE-core%E2%84%A2-i9-processor&gclsrc=3p.ds&msclkid=08af0fc16777154e9a456aff28910976&utm_source=bing&utm_medium=cpc&utm_campaign=HPCOM%7CHPStore%7CHHO%7CHome%26HomeOffice%20%7C%20IN%20BPS%20Commercial%20CEPP%20%7CIN%7CBrand%7CExact%7CEN&utm_term=laptop&utm_content=Generic");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> allLinks= driver.findElements(By.tagName("a"));
        
        //to find the size of list
        System.out.println("The total no: of links in this page is :"+allLinks.size());
        //System.out.println(allLinks);
        driver.findElement(By.xpath("//button[(text()='Accept All Cookies')]")).click();
        //to get the 2nd linkText of this page
        //System.out.println(allLinks.get(2).getText());
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("HP",Keys.ENTER);
        List<WebElement> laptops = driver.findElements(By.xpath("//span[@class='price']"));
        //List<String> list = new Array<> 
        
        
        
         

	}

}
