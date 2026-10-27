package MyDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Open Chrome browser
		
		//Setup the behaviour of the Chrome Browser
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--start-maximized","--disable-notifications");//--headless , --disable-notifications , --incognito
		
	 
		
		// Creating an object of the chromedriver for webdriver instance 
		
        WebDriver driver = new ChromeDriver(options);

        // Go to a website
        
        driver.get("https://www.google.com" );
        
        driver.navigate().refresh();
        
        driver.navigate().to("https://www.gmail.com" );
                 
        
        // Print the title
      
        System.out.println(driver.getTitle());
        
        //To get the URL 
        
        System.out.println(driver.getCurrentUrl());
        
        //To get the page source 
        
        //System.out.println(driver.getPageSource());
        
        driver.navigate().back();

        // Close the browser
        
        driver.quit();
	}

}
