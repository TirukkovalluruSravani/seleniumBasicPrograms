package webdriver1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class double_frame {

	public static void main(String[] arg) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver d=new ChromeDriver();
		//FirefoxDriver d= new FirefoxDriver();
		 //d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			d.navigate().to("https://www.dezlearn.com/nested-iframes-example/"); 
			d.manage().window().maximize();
			Thread.sleep(3000);
			d.switchTo().frame("parent_iframe");
			//Thread.sleep(3000);
			d.findElement(By.xpath("//*[@id=\"u_5_5\"]")).click();
			d.switchTo().frame("iframe1");
			d.findElement(By.id("u_5_6")).click();
			//navigate to window
			d.switchTo().defaultContent();
			d.findElement(By.className("menu-link")).click();
	}

}
