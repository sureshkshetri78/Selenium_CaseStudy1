package casestudy1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\QA Automation software\\chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();
		driver.get("http://www.edureka.co"); // Open url edureka.co
		driver.manage().window().maximize(); //maximize window 
		driver.findElement(By.id("search-inp")).sendKeys("selenium"); //type selenium in search box
		try {
			Thread.sleep(3000); // thread sleep for 3000ms
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.findElement(By.id("search-button-top")).click(); // click on search button
		
       driver.findElement(By.cssSelector("#add-training-courses > a:nth-child(1) > div.card.giTrackElement.giTrackElementHover > div.courseinfo > div.textinfoleft > h3")).click(); 
       // Click on Selenium certification training
       driver.findElement(By.name("user_v1[query]")).sendKeys("framework"); // type framework in search box
       try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
       driver.findElement(By.id("search-button-top")).click(); // click on search button
       driver.findElement(By.xpath("//*[@id=\"add-training-courses\"]/a[1]/div[1]/div[2]/div[1]/h3")).click(); // click on spring framework certification  
	   
	  
		driver.findElement(By.linkText("Log In")).click(); // use of link text for Log In
	   driver.navigate().back();
//	   driver.findElement(By.partialLinkText("og I")).click(); // Use of partial text for Log In
//	   driver.navigate().back();
	  
	  List<WebElement> taglist  = driver.findElements(By.tagName("input")); // find elements by tag name
	  System.out.println(taglist.size()); // printing total no. of input tags in page
	}

}
