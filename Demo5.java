package MyDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
	
//Xpath is like the XML path language and if cssSelector is short address then Xpath is whole GPS to it.	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("Https://www.google.com");
		
		driver.findElement(By.xpath("//textarea[@name = 'q']")).sendKeys("Gmail");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//textarea[@name = 'q']")).sendKeys(Keys.ESCAPE);
		
		
		// // -> Search Anywhere in the Page
		// tagname -> textarea , the element type like input, button, textarea
		//[....] -> condition or filter which says what to check
		//@attribut -> @ means attribute like @id, @name
		
		for(WebElement btn : driver.findElements(By.xpath("//input[@name = 'btnK']"))) {
			if(btn.isDisplayed()) {
				btn.click();
				break;
			}
		}	
//		driver.findElement(By.xpath("//input[@name = 'btnK']")).click();
		//will not work as in google page there are two btnK present and we can't access to both at the same time 
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Successful");
		
		driver.quit();
	}

}
