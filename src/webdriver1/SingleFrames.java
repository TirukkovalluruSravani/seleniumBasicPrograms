package webdriver1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingleFrames {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\sony\\\\\\\\Desktop\\\\\\\\w3 selenium utilities\\\\\\\\chromedriver.exe");
		
		//ChromeDriver driver =new ChromeDriver();
		FirefoxDriver driver=new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://www.dezlearn.com/iframe-example/"); 
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame("iframe1");
		//Thread.sleep(3000L);
		driver.findElement(By.id("u_5_6")).click();
	//	driver.switchTo().alert();
	//	driver.findElement(By.id("")).click();
}}
