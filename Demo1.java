package MyDemo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		
//		Locators to Find the Elements in the Web page, first open Inspect and search for following
		
		driver.findElement(By.id("user-name")).sendKeys("Rishabh "); // BY ID, it is unique preference 1 
		
		driver.findElement(By.name("user-name")).sendKeys("Rahul "); // BY Name, it has priority 2 
		
		driver.findElement(By.className("input_error")).sendKeys("Rishabh "); 
//BY Class it is used by developers for styling in CSS, not recommended to use as class can be same for many elements 
		
//		driver.findElement(By.className("form_input")); //it also works for that as class contains the name with space and space is not allowed.

		List<WebElement> inputs  = driver.findElements(By.className("input_error"));
		
		System.out.println("No. of input boxes of class " + inputs.size());
		
		for(WebElement input : inputs) {
			System.out.println(input.getText()); //it print empty as it will try to print HTML text between <input></input> but its nothing between them 
			System.out.println(input.getAttribute("value"));
		}
		
				
		driver.findElement(By.tagName("input")).sendKeys("Raj");
		
		List<WebElement> lists = driver.findElements(By.tagName("inputs"));
		
		System.out.println("No. of List in the tag " + lists.size());
		
		for(WebElement list : lists) {
			System.out.println(list.getText());
		}
		
		try {
			Thread.sleep(3000); //Hold for 3 seconds to check and try catch if any exception occurs
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		driver.quit();
		
	}

}
