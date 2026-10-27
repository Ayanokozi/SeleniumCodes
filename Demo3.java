package MyDemo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		
// cssSelector- Most developer used CSS language to design the Web page and Selenium also used that language for locating elements.
// It uses Symbol to locate the elements like # for id, . for class and (nothing) for tag, more also there like this. 		
// # -> id 		
// #user-name literally means: "the element whose id is user-name". It's the same as By.id("user-name")		
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		
//(Nothing) for tag means input[attribute = 'value'], it is used when there is no id and class then we use these to get through other attributes.
		
		driver.findElement(By.cssSelector("input[id = 'password']")).sendKeys("secret_sauce");
		
// .btn_action means: "element having class btn_action".		
//		driver.findElement(By.cssSelector(".btn_action")).click();
		
// Also in by.className you can't write both the classes with spaces but it can fix the problem we can write both the classes but without spaces.		
		driver.findElement(By.cssSelector(".submit-button.btn_action")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Successful");
		
		driver.quit();		
		
	}

}
