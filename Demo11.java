package MyDemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text() = 'Click for JS Alert']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		String result = driver.findElement(By.id("result")).getText();
		
		System.out.println("Here is the result for alert: " + result );
		
		driver.quit();
		
		
	}

}
