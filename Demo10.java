package MyDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo10 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		driver.get("https://www.saucedemo.com");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		//DropDown -> We use the Class "Select" here for dropdown.
		
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@class = 'product_sort_container']"));
		
		Select dropdown = new Select(dropdownElement);
		
		dropdown.selectByIndex(2);
		
		Select dropDown = new Select(driver.findElement(By.xpath("//select[@class = 'product_sort_container']")));
		
		System.out.println("Here is the Selected Element: " + dropDown.getFirstSelectedOption().getText());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		
		
		
		
	}
}
