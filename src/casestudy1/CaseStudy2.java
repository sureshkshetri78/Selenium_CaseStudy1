package casestudy2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseStudy2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Training QA\\Selenium Training\\Driver\\chromedriver.exe "); 
		WebDriver driver = new ChromeDriver(); //Launch Chrome browser
		
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS); //setting PageLoad timeout
		driver.get("http://www.edureka.co"); //Navigating to url www.edureka.co
		driver.manage().window().maximize(); // Maximize browser window
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //setting implicit Wait 10 sec for all activities in browser
		driver.manage().timeouts().setScriptTimeout(50, TimeUnit.SECONDS); // Setting script timeout 
		driver.findElement(By.xpath("//*[@id=\"search-inp\"]")).sendKeys("Selenium"); // type selenium in search box
		driver.findElement(By.xpath("//*[@id=\"search-button-top\"]")).click(); // click on search button
		
		WebDriverWait wait = new WebDriverWait(driver, 10);		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"add-training-courses\"]/a[1]/div[1]/div[2]/div[1]/h3"))).click();
		//adding explicit wait for page to navigate to another page 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // wait till whole whole page loads
		String AppTitle = driver.getTitle(); // get the page title
		System.out.println(AppTitle); // print title 
		
		boolean Result = AppTitle.equals("Selenium Certification | Selenium Training | Selenium Course - Edureka");
		System.out.println(Result); // validate page title (true or false)
		driver.navigate().back();   // navigate to previous page 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // wait till whole page loads 
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a")).click(); // click on courses (all courses)
		
		//Note: We didn't go through fluent wait script yet.
		

	}

}
