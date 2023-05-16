package Task1ByKiran;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
		    driver.get("https://www.opencart.com/index.php?route=account/register");
			
        	driver.manage().window().maximize();	
			WebElement ele1=driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[6]/ul/li[2]/a"));
			Select sc=new Select(ele1);
			sc.selectByVisibleText("Contact Us");
			
		//	List<WebElement>all=sc.getOptions();
		//	System.out.println(all.size());
		
			/* for(WebElement ele2:all){
				
				System.out.println(ele2.getText());
				
				if(ele2.getText().equals("Bahamas")){
					ele2.click();
					continue; */
				
				//}
				
			}
				

		}
//}
