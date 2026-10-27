package MyDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org ");
		
		String str = driver.getTitle();
		
		System.out.println(str);
		
		driver.switchTo().newWindow(WindowType.TAB);
				
		driver.navigate().to("https://www.google.com");
		
		String str1 = driver.getTitle();
		
		System.out.println(str1);
		
		driver.close();
		
		driver.quit();	
		
	}

}
