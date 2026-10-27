package MyDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo9 {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.saucedemo.com");
			
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			
			driver.findElement(By.id("login-button")).click();
			
			driver.findElement(By.xpath("//div[contains(text(), 'Backpack')]")).click();
			
//Now if we need to wait to check manually whether it will work or not ,we have 3 methods	
//1 -> Thread.sleep();	Worst Method -> It will freeze everything for the given time no matter what.	
//2 -> Implicit wait method -> It will wait for certain time until Selenium don't get that element. or it is general wait for everything
			
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
//3 -> Explicit wait method -> Special Patience for specific thing. It only just wait for specific thing but for specific condition also.		
			
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
//			
//			WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
//			//it will wait until the button is Clickable.
//			
//			button.click();
			
			driver.quit();		
			
			
		}


}
