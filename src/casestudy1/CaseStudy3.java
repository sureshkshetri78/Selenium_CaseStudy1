package casestudy1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CaseStudy3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Training QA\\Selenium Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Launch browser 
		driver.get("https://www.expedia.com/Flights"); 
		
		driver.manage().window().maximize(); //maximize window 
		// Select one way 
		driver.findElement(By.id("flight-type-one-way-label-flp")).click(); 
		//Source 
		driver.findElement(By.xpath("//*[@id=\"flight-origin-flp\"]")).sendKeys(" Bengaluru, India");
		Thread.sleep(5000);
		//Destination
		driver.findElement(By.xpath("//*[@id=\"flight-destination-flp\"]")).sendKeys("Lucknow, India");
		//Depature Date
	    driver.findElement(By.xpath("//*[@id=\"flight-departing-single-flp\"]")).sendKeys("07/07/2019");
	    //Setting Passengers details   
	    driver.findElement(By.xpath("//*[@id=\"traveler-selector-flp\"]/div/ul/li/button")).click();
	   
	    driver.findElement(By.xpath("//*[@id=\"traveler-selector-flp\"]/div/ul/li/div/div/div/div[1]/div[4]/button")).click();
	    driver.findElement(By.xpath("//*[@id=\"traveler-selector-flp\"]/div/ul/li/div/div/div/div[1]/div[4]/button")).click();	    
	    driver.findElement(By.xpath("//*[@id=\"traveler-selector-flp\"]/div/ul/li/div/div/div/div[2]/div[1]/div[4]/button")).click();
	    driver.findElement(By.xpath("//*[@id=\"traveler-selector-flp\"]/div/ul/li/div/div/div/div[2]/div[1]/div[4]/button")).click();
	    Thread.sleep(3000);
	    
	    Select oSelect = new Select(driver.findElement(By.xpath("//*[@id=\"flight-age-select-1-flp\"]")));
	    oSelect.selectByValue("5");
	    
	    Select oSelect1 = new Select(driver.findElement(By.xpath("//*[@id=\"flight-age-select-2-flp\"]")));
	    oSelect1.selectByValue("6");
	   //close dialog box
	    driver.findElement(By.xpath("//*[@id=\"traveler-selector-flp\"]/div/ul/li/div/footer/div/div[2]/button")).click();
	    
	    driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-flp\"]/div[8]/label/button")).click();
	   
	   // driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	}
	
	

}
