package webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankProjectTast1 {

	   public static void main(String[] args) throws InterruptedException {
		   	
			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sony\\\\Desktop\\\\w3 selenium utilities\\\\chromedriver.exe");
			ChromeDriver a1=new ChromeDriver();
			a1.get("https://demo.guru99.com/test/newtours/index.php");
			a1.manage().window().maximize();
		    a1.findElement(By.linkText("Bank Project")).click();
		    a1.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr476467");
		   
		    a1.findElement(By.xpath("//input[@name='password']")).sendKeys("AjAgahe");
		    Thread.sleep(2000);
		    a1.findElement(By.name("btnLogin")).click(); 
		    
		    a1.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr476467");
			   
		    a1.findElement(By.xpath("//input[@name='password']")).sendKeys("AjAgahe");
		    Thread.sleep(2000);
		    a1.findElement(By.name("btnReset")).click();
		    Thread.sleep(2000);
		    a1.close();
}
}