package webdriver1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsConfirmationbutton {

	  public static void main(String[] args) throws InterruptedException {
		   	// TODO Auto-generated method stub
		   	String url="https://demoqa.com/alerts";
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		 
		WebElement text=d.findElement(By.id("confirmResult"));
		System.out.println(text.getText());
		 
		 
		   }
		 
		}


