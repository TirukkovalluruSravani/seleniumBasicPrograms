package webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQARegistrationPage {

	 public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe");
		ChromeDriver ch=new ChromeDriver();
		ch.get("https://demoqa.com/automation-practice-form");
		ch.manage().window().maximize();
		
		  ch.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sravani");
		  Thread.sleep(2000);
		  ch.findElement(By.xpath("//input[@id='lastName']")).sendKeys("n");
		  Thread.sleep(2000);
		  ch.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("sra123@gmail.com");
		  Thread.sleep(2000);
		  ch.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		  Thread.sleep(2000);
		  ch.findElement(By.id("userNumber")).sendKeys("1234567890");
		  Thread.sleep(2000);
		  ch.findElement(By.id("dateOfBirthInput")).sendKeys("14 Mar 2023");
		  Thread.sleep(2000);
		  ch.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("hello world");
		  Thread.sleep(2000);
		  ch.close();
	}
}
