package webdriver1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class singleWindow 
{
        public static void main(String[] args) throws InterruptedException {
		   	// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/browser-windows");
		d.manage().window().maximize();
		 
		String parent_id=d.getWindowHandle();
		System.out.println(parent_id);
		 
		d.findElement(By.id("tabButton")).click();
		Set<String>Child_id=d.getWindowHandles(); 
		System.out.println(Child_id);	 
		for(String handle: Child_id)
		{
		   if(!handle.equals(parent_id))
		   {
		   	d.switchTo().window(handle);
		   	WebElement Text=d.findElement(By.id("sampleHeading"));
		      System.out.println(Text.getText());
		 	//d.close();
		   	Thread.sleep(2000);
		   }
		   d.switchTo().window(parent_id); 
		}	
}}