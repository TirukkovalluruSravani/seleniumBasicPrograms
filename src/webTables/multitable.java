package webTables;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class multitable {

	   public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe");
	ChromeDriver d=new ChromeDriver();
	d.get("https://www.timeanddate.com/worldclock/");
	d.manage().window().maximize();
	String a="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	String b="]/td[";
	String c="]";
	for(int i=1;i<=10;i++)
	{
	   for(int j=1;j<=2;j++)
	   {
	   String c1=d.findElement(By.xpath(a+i+b+j+c)).getText();
	   System.out.println(c1); 
	}
	   }
	   }
	}

