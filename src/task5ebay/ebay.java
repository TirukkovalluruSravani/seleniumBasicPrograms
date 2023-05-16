package task5ebay;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

    public class ebay {
	WebDriver d;
	public void open_brower()
	{
		WebDriverManager.chromedriver().setup();
		d= new ChromeDriver();
		d.get("https://www.ebay.com/");
		}
    public void maximaze()
    {
    	d.manage().window().maximize();
    }
    public void geturlAndTitle()
	{
		System.out.print(d.getCurrentUrl());
		System.out.println(d.getTitle());
	}
	public void categorie()
	{
		
		d.findElement(By.id("gh-shop-a")).click();
		d.findElement(By.xpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/h3[2]/a")).click();
		d.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Apple Watches");
		d.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		List<WebElement> l=d.findElements(By.xpath("//div[@id='srp-river-results']"));
		
		for (WebElement k:l)
		{
			System.out.println(k.getText());
		}				
	}
	public void scrollDown()
	{
		List<WebElement> l1=d.findElements(By.xpath("//div[@id='srp-river-results']/ul/li"));
		Iterator<WebElement> i=l1.iterator();
		
		Actions ac=new Actions(d);     
		for (int c=0;c<l1.size();c++)
		{	WebElement w=i.next();
			ac.moveToElement(w).build().perform();
	}
		} 
	public static void main(String[] args) throws InterruptedException
	{
		ebay e=new ebay();
		e.open_brower();
		e.maximaze();
		e.geturlAndTitle();
		e.categorie();
		e.scrollDown();	
	}
	}
