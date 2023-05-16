package Windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWindow {

	  public static void main(String[] args) throws InterruptedException {
		   	// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/browser-windows");
		d.manage().window().maximize();
		 String str=d.getWindowHandle();
	System.out.print(str);
	d.findElement(By.id("tabButton")).click();
	Set <String> str2=d.getWindowHandles();
	System.out.println(str2);
	for(String s:str2)
		if (!s.equals(str))
		{
			d.switchTo().window(s);
			System.out.println(d.findElement(By.id("sampleHeading")).getText());
		} 
}}