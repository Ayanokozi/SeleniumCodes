package MyDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//textarea[@name = 'q']")).sendKeys("Gmail");
		
		driver.findElement(By.xpath("(//input[@name = 'btnK'])[2]")).click();
//Indexing Method -> if there are same thing 2 or more times like "google search" button two times that needs the different syntax to locate
//with the indexing like [2],[1] and [3] etc. -> ("(//input[@name = 'btnK'])[2]")		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();		
	}

}
