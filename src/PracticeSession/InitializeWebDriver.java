package PracticeSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitializeWebDriver {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe");
    ChromeDriver d=new ChromeDriver();
    d.get("https://www.google.com/");
    d.manage().window().maximize();
    d.findElement(By.name("q")).sendKeys("demo sites");
    
    d.findElement(By.name("q")).sendKeys(Keys.ENTER); // navigate to demo sites page by enter enter button
    
    d.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div/div/div[1]/div/a")).sendKeys(Keys.ENTER); //select the seleted link and entered the enter button
    WebElement drop= d.findElement(By.xpath("//*[@id=\"mobile_menu\"]"));
    List<WebElement>drop1=drop.findElements(By.xpath("//*[@id=\"mobile_menu\"]/ul/li[1]/a"));
 //   List<WebElement>drop2=drop1.findElements(By.tagName("a"));
 	System.out.println(drop1.size());
 	
 	for(int i=0;i<drop1.size();i++)
	{
		System.out.println(drop1.get(i).getText());
		drop1.get(i).click();
		Thread.sleep(2000);
	    System.out.println(d.getTitle());
	    System.out.println(d.getCurrentUrl());

	
    Thread.sleep(3000);
    
   d.close();
}


}
}