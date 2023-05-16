package webdriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class comexample {

	public static void main(String[] args) throws Exception {
	/*	System.setProperty("webdriver.chrome.driver","C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	//	driver.get("http://www.google.com");
	//	driver.get("http://www.amazon.com");
		driver.navigate().back();
		driver.get("http://www.flipkart.com");
      driver.manage().window().maximize();
      Thread.sleep(2000); 
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
       
		WebDriver driver1= new ChromeDriver();
		driver1.get("http://www.amazon.com");  */
		
		System.setProperty("webdriver.IED.driver","C:\\Users\\sony\\Desktop\\w3 selenium utilities\\IEDriverserver.exe");
		InternetExplorerDriver d= new InternetExplorerDriver();
		d.get("http://www.google.com");
		System.out.println(d.getTitle()); 
	}

}
