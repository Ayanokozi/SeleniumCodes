package MyDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com"); //open the url in chrome
		 
		driver.findElement(By.linkText("Forgot Password")).click(); //in that page it click on forgot password 
		
		System.out.println("Page Title: " + driver.getTitle()); //Print the title but written in inspect
		
		driver.navigate().back(); //Navigate to back page 
		
		driver.findElement(By.linkText("Checkboxes")).click();
		
		System.out.println("Page title: " + driver.getTitle());
		
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Forgot")).click(); //No need to write Complete Text of forgot password
		
		System.out.println("Page Title: " + driver.getTitle());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();		
	}

}
