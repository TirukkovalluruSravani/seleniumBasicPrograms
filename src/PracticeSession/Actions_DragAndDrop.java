package PracticeSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sony\\\\Desktop\\\\w3 selenium utilities\\\\chromedriver.exe");
	
		WebDriver driver =new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://demoqa.com/droppable/"); 
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Actions ac=new Actions(driver);
		
		WebElement ele1=driver.findElement(By.id("draggable"));
		WebElement ele2=driver.findElement(By.id("droppable"));
		
		ac.dragAndDrop(ele1, ele2).build().perform();
		driver.close();

	}


}
