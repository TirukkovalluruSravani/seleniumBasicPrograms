package TasK2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmBoxAllert {

	public static void main(String[] args) throws InterruptedException {
		

		 System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\sony\\\\\\\\Desktop\\\\\\\\w3 selenium utilities\\\\\\\\chromedriver.exe");
		 ChromeDriver d=new ChromeDriver();
		 d.get("https://demoqa.com/alerts");
		 d.manage().window().maximize();
		 System.out.println(d.getCurrentUrl());
		 System.out.println(d.getTitle());
		
		 d.findElement(By.xpath("//button[@id='confirmButton']")).click();
		 Thread.sleep(2000);
			Alert alt=d.switchTo().alert();
			System.out.println(alt.getText());
			alt.accept();
			
			WebElement text=d.findElement(By.id("confirmResult"));
			System.out.println(text.getText());
			d.close();
			//cancel button????
	}

}
