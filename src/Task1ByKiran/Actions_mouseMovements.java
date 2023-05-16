package Task1ByKiran;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_mouseMovements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe");
ChromeDriver d=new ChromeDriver();
d.get("https://jqueryui.com/menu/");
d.manage().window().maximize();

d.switchTo().frame(0);

WebElement music=d.findElement(By.id("ui-id-9"));
Thread.sleep(2000);
music.click();

WebElement Jazz=d.findElement(By.id("ui-id-13"));
Thread.sleep(2000);
Jazz.click();

WebElement modern=d.findElement(By.id("ui-id-16"));
Thread.sleep(2000);
modern.click();

Actions a=new Actions(d);
a.moveToElement(music).moveToElement(Jazz).moveToElement(modern).build().perform();


d.close();
	
	
}
}
