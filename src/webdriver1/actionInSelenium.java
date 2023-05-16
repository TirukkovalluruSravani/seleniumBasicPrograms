package webdriver1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver ch= new FirefoxDriver();
		ch.get("http://www.google.com");
		ch.manage().window().maximize();
		WebElement link=ch.findElement(By.linkText("Gmail"));
		Actions act=new Actions(ch);
		//context click is used for right click
		act.contextClick(link).sendKeys("L").build().perform();
	}
}