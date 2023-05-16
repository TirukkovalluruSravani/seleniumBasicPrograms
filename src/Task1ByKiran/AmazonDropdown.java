package Task1ByKiran;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDropdown
{
	
		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sony\\\\Desktop\\\\w3 selenium utilities\\\\chromedriver.exe");
			ChromeDriver d = new ChromeDriver();
			d.get("http://www.amazon.in");
			d.manage().window().maximize();
			WebElement e= d.findElement(By.id("searchDropdownBox"));
			List<WebElement> l= e.findElements(By.tagName("option"));
			System.out.println(l.size());
			for(int i=0;i<l.size();i++)
			{
				System.out.println(l.get(i).getText());
			}
			
			//d.close();
		}
	}


