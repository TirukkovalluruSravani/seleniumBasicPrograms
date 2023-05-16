package webdriver1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allerts {


	   public static void main(String[] args) {
	   	// TODO Auto-generated method stub
	String url="https://demoqa.com/alerts";
	   System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\sony\\\\\\\\Desktop\\\\\\\\w3 selenium utilities\\\\\\\\chromedriver.exe");
	ChromeDriver d=new ChromeDriver();
	d.get(url);
	d.manage().window().maximize();
	//print the current title in console window
    System.out.println(d.getTitle());
    //print the current url in console window
	System.out.println(d.getCurrentUrl());
	d.findElement(By.id("alertButton")).click();
	Alert alt=d.switchTo().alert();
	System.out.println(alt.getText());
	//Thread.sleep(2000);
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	alt.accept();
	 
	}
	}

