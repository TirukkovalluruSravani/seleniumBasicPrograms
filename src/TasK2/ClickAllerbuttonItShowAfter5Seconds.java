package TasK2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAllerbuttonItShowAfter5Seconds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\sony\\\\\\\\Desktop\\\\\\\\w3 selenium utilities\\\\\\\\chromedriver.exe");
		 ChromeDriver d=new ChromeDriver();
		 d.get("https://demoqa.com/alerts");
		 d.manage().window().maximize();
		 System.out.println(d.getCurrentUrl());
		 System.out.println(d.getTitle());
		 d.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		 d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 Alert alt=d.switchTo().alert();
		 System.out.println(alt.getText());
		 alt.accept();
		 
	}

}
