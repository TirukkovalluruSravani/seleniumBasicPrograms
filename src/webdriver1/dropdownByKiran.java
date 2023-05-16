package webdriver1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdownByKiran {

		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
		    driver.get("https://www.opencart.com/index.php?route=account/register");
			
        	driver.manage().window().maximize();	
			WebElement ele1=driver.findElement(By.xpath("//*[@class='form-group required']/select"));
			Select sc=new Select(ele1);
			sc.selectByValue("4");
			List<WebElement>all=sc.getOptions();
			System.out.println(all.size());
		
			for(WebElement ele2:all){
				
				System.out.println(ele2.getText());
				
				if(ele2.getText().equals("American Samoa")){
					ele2.click();
					continue;
				
				}
				
			}
				

		}

	}
