package webdriver1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	
		 
		  public static void main(String[] args) {
			// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sony\\\\Desktop\\\\w3 selenium utilities\\\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/index.php");
		d.manage().window().maximize();
		 
		WebElement link=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		List<WebElement>links=link.findElements(By.tagName("a"));
		 
		System.out.println(links.size());
		 
		for(int i=0;i<links.size();i++)
		{
		System.out.println(links.get(i).getText());
		
		}
		 
		  }
		 
		}
		 


