package webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99RegisterPage {

	

	   public static void main(String[] args) throws InterruptedException {
	   	
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sony\\\\Desktop\\\\w3 selenium utilities\\\\chromedriver.exe");
	ChromeDriver a1=new ChromeDriver();
	a1.get("https://demo.guru99.com/test/newtours/index.php");
	a1.manage().window().maximize();
    a1.findElement(By.linkText("REGISTER")).click();
    a1.findElement(By.name("firstName")).sendKeys("testing123");
    Thread.sleep(2000);
    a1.findElement(By.name("lastName")).sendKeys("testing");
    Thread.sleep(2000);
    a1.findElement(By.name("phone")).sendKeys("9998887776");
    Thread.sleep(2000);
    a1.findElement(By.name("userName")).sendKeys("sss123ss@gmail.com");
    Thread.sleep(2000);
    
    
    a1.findElement(By.name("address1")).sendKeys("door no:1234");
    Thread.sleep(2000);
    a1.findElement(By.name("city")).sendKeys("hyd");
    Thread.sleep(2000);
    a1.findElement(By.name("state")).sendKeys("Telangana");
    Thread.sleep(2000);
    a1.findElement(By.name("postalCode")).sendKeys("500082");
    Thread.sleep(2000);
    a1.findElement(By.name("country")).sendKeys("INDIA");
    Thread.sleep(2000);
    
    

    a1.findElement(By.name("submit")).click();

    a1.close();
}
}
