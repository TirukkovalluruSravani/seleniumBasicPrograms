package PracticeSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {


	   public static void main(String[] args) throws InterruptedException {
	   	// TODO Auto-generated method stub
	   	String url="https://demoqa.com/frames";
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe");
	ChromeDriver d=new ChromeDriver();
	d.get(url);
	d.manage().window().maximize();

	d.switchTo().frame("frame1");
   	WebElement text=d.findElement(By.id("sampleHeading"));
      System.out.println(text.getText());
      
}
}