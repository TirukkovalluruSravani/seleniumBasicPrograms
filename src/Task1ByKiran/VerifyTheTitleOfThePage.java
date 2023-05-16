package Task1ByKiran;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheTitleOfThePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle()); 
		System.out.println(driver.getCurrentUrl()); 
		driver.close();
	}

}
