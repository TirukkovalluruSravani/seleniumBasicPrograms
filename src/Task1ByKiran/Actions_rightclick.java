package Task1ByKiran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_rightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver ch= new FirefoxDriver();
		ch.get("http://www.google.com");
		ch.manage().window().maximize();
		WebElement link=ch.findElement(By.linkText("Images"));
		Actions act=new Actions(ch);
	
		//contextclick is used for right click
		act.contextClick(link).sendKeys("w").build().perform();
		   Thread.sleep(3000);
		ch.close();

}
}
