package webdriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateToWebPAges {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("http://www.google.com");
d.manage().window().maximize();
d.get("http://www.flipkart.com");
d.navigate().back();
d.get("http://www.amazon.com");
d.navigate().back();
Thread.sleep(2000);
d.close();

FirefoxDriver d1= new FirefoxDriver();

d1.get("http://www.google.com");
d.manage().window().maximize();
d1.get("http://www.snapdeal.com");
d1.navigate().back();
d1.navigate().forward();
d1.get("http://www.firstcry.com");
d1.navigate().back();

	System.out.println(d.getTitle());
	System.out.println(d.getCurrentUrl());
	System.out.println(d1.getTitle());
	System.out.println(d1.getCurrentUrl());
	d.close();
	d1.close();
	}

}
