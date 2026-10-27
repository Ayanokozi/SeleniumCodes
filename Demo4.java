package MyDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
//		driver.findElement(By.name("q")).sendKeys("Gmail" + Keys.ENTER); //Search the Gmail and press Enter
		
//		driver.findElement(By.name("q")).sendKeys("Gmail" + Keys.ESCAPE); 
		//Esc won't work like that as it happens very fast so before dropdown appears the Esc will execute
		
		driver.findElement(By.name("q")).sendKeys("Gmail");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE);
		//This is to Remove the DropDown when it search the GMail in the Search BOX.
	
//		driver.findElement(By.name("btnK")).click();	
//Click the Google search button	 but it won't work sometimes as btnK contains by two button and in HTML order first one is considered
//and if first one is invisible means that one from dropdown then it won't work.		
		
		
//If we want to click google search in the Dropdown then we need to do some changes		
		List<WebElement> buttons = driver.findElements(By.name("btnK")); //findElements -> return the list of the Element it contains 
		
		System.out.println(buttons.size()); //it return the size of the list that how many elements are there related to "btnk"
		
		for(WebElement btn : buttons) { //it is for each loop for the element 
			if(btn.isDisplayed()) {     //btn.isDisplayed will consider the element visible to the user
				btn.click();            //click on that element  
				break;
			}
		}
		
		
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
