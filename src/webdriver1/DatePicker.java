package webdriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sony\\\\Desktop\\\\w3 selenium utilities\\\\chromedriver.exe");
	ChromeDriver d=new ChromeDriver();
	d.get("https://jqueryui.com/datepicker/");
	d.manage().window().maximize();

	d.switchTo().frame(0);
//	d.findElement(By.id("datepicker")).clear();
//	Thread.sleep(2000);
	d.findElement(By.id("datepicker")).click();
	d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[3]/a")).click();
		}
}
