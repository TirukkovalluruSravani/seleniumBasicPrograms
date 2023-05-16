package Task3;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
	public static void main(String[] args) throws InterruptedException
	{
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		d.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		
		d.switchTo().frame("globalSqa");
		Thread.sleep(2000);
		d.findElement(By.xpath("//*//input[@placeholder='Search...']")).sendKeys("selenium");
		Thread.sleep(2000);
		d.findElement(By.className("button_search")).click();
		Thread.sleep(2000);
		
		d.findElement(By.className("more-link")).click();
		Thread.sleep(2000);
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"menu-item-2815\"]/a")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"Open New Window\"]")).click();
		d.findElement(By.xpath("//*[@id=\"post-2632\"]/div[2]/div/div/div[2]/a")).click(); 
		
//	System.out.println(d.findElement(By.xpath("//*[@id=\"post-2632\"]/div[2]/div/div/div[2]/div")).getText());
	 //click on tester hub dropdown on top
		//d.findElement(By.xpath("//*[@id=\"menu-item-2822\"]/a")).notifyAll();
	}
}
