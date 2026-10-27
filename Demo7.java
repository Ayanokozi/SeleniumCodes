package MyDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		driver.findElement(By.xpath("//div[contains(text(), 'Backpack')]")).click();
		
//Here is the Xpath new type using contains, it is used when there are something that is changeable but contains something that doesn't change 
//so it locate that things with that Syntax -> "//div[contains(text(), 'Backup')]"		
// "//div[contains(text(), 'Backup')]" -> find div element in the page where it contains text that is 'Backpack' .

//If something is keep changing then search for another stable thing and can use other methods
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();		
		
	}

}
