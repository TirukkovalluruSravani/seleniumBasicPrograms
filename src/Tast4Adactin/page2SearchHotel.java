package Tast4Adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class page2SearchHotel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
	    d.get("https://adactinhotelapp.com/SearchHotel.php");
		
    	d.manage().window().maximize();
WebElement ele=d.findElement(By.xpath("//select[@id='location']"));
Select sc=new Select(ele);
sc.selectByVisibleText("London");


	}

}
