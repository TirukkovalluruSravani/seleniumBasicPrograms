package webTables;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class printOnlyRow {

	 public static void main(String[] args) {
		   	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		String a="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[6]/td[";
		String b="]";
		for(int i=1;i<=36;i++)
		{
		 String c=d.findElement(By.xpath(a+i+b)).getText();
		   System.out.println(c);
		} 
	}
}


