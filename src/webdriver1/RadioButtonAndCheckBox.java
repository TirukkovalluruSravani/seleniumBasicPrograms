package webdriver1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAndCheckBox {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/radio.html");
		d.manage().window().maximize();
		//click on selenium icon for getting out the radio buttons 
		d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		
		//click on Radio and check box icon from menu bar 
		d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[2]/a")).click();
		
		//clicking first radio buttons 
		d.findElement(By.id("vfb-7-1")).click();
		//selecting first check box 
		d.findElement(By.id("vfb-6-0")).click();
		
		
		WebElement RadioButtonAndCheckBox=d.findElement(By.xpath("/html/body/div[4]"));
		List<WebElement>RandC1=RadioButtonAndCheckBox.findElements(By.tagName("input"));
		
		System.out.println(RandC1.size());
		for(int i=0;i<RandC1.size();i++)
		{
			System.out.println(RandC1.get(i).getAttribute("value")+" "+RandC1.get(i).getAttribute("checked")); 
		}
	}

}



