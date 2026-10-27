package MyDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		String Parent = driver.getWindowHandle();  //making the current window the parent one and store into the string 
		
		driver.findElement(By.linkText("Click Here")).click(); //new tab opens 
		
		for(String handle : driver.getWindowHandles()) { //now all the tab string id were store in list called handle
			if(!handle.equals(Parent)) {                 //now it checks if current handle is not parent tab
				driver.switchTo().window(handle);        //now switch the focus of the drivers to the current tab from parent tab
				break;
			}
		}
		
		driver.switchTo().window(Parent);  
//Also it switches the tab with focus but that's not the point its just the additional thing that tab is changed 
//We don't use this for method to switch tab its just to change the focus of drivers.
		
		
		driver.quit();
		
		
		
		
	}
}
