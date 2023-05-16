package webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class singleFrame {

	
		   WebDriver d;
		   String url="https://demoqa.com/frames";
		   public void Opening_Browser()
		   {
			   System.setProperty("webdriver.chrome.driver","C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe");
		   	d=new ChromeDriver();
		   }
		   public void Navigate()
		   {
		   	d.get(url);
		   	d.manage().window().maximize();
		   	
		   }
		   public void title()
		   {
		      System.out.println(d.getTitle());
		   }
		   public void url()
		   {
		   System.out.println(d.getCurrentUrl());
		   	
		   }
		   public void frame()
		   {
		   	d.switchTo().frame("frame1");
		   	WebElement text=d.findElement(By.id("sampleHeading"));
		      System.out.println(text.getText());
		 
		   }
		   public void close()
		   {
		   	d.close();
		   	
		   }
		 
		   public static void main(String[] args)
		   {
			   singleFrame a1=new singleFrame();
		   	a1.Opening_Browser();
		   	a1.Navigate();
		   	a1.title();
		   	a1.url();
		   	a1.frame();
		   	a1.close();
		   	
		   }
}