package Tast4Adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotelapplogin {
	WebDriver d;
	
	public void open_brower() {
		WebDriverManager.chromedriver().setup();
		d= new ChromeDriver();
		d.get("https://adactinhotelapp.com/");
		
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
		public void login() throws InterruptedException
		{
		
		d.findElement(By.xpath("//input[@id='username']")).sendKeys("vamshinani");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='login']")).click();
		Thread.sleep(2000);
	}
	
		public void searchHotel() throws InterruptedException
		{
	    	
	WebElement ele=d.findElement(By.xpath("//select[@id='location']"));
	Select sc=new Select(ele);
	sc.selectByVisibleText("London");
	Thread.sleep(2000);
	
	WebElement ele1=d.findElement(By.xpath("//select[@id='hotels']"));
	Select sc1=new Select(ele1);
	sc1.selectByVisibleText("Hotel Sunshine");
	Thread.sleep(2000);
	
	WebElement ele3=d.findElement(By.xpath("//select[@id='room_type']"));
	Select sc3=new Select(ele3);
	sc3.selectByVisibleText("Standard");
	Thread.sleep(2000);
	
	WebElement ele4=d.findElement(By.xpath("//select[@id='room_nos']"));
	Select sc4=new Select(ele4);
	sc4.selectByValue("1"); //or select by visibleText we can use
	
	d.findElement(By.xpath("//input[@id='datepick_in']")).sendKeys("28/03/2023");
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='datepick_out']")).sendKeys("31/03/2023");
	Thread.sleep(2000);

	WebElement ele5=d.findElement(By.xpath("//select[@id='adult_room']"));
	Select sc5=new Select(ele5);
	sc5.selectByVisibleText("2 - Two");
	Thread.sleep(2000);
	
	WebElement ele6=d.findElement(By.xpath("//select[@id='child_room']"));
	Select sc6=new Select(ele6);
	sc6.selectByVisibleText("1 - One");
	Thread.sleep(2000);
	
	d.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
	Thread.sleep(2000);
		}
		
		public void SelectHotel() throws InterruptedException
		{
			d.findElement(By.id("radiobutton_0")).click();
			Thread.sleep(2000);
			d.findElement(By.xpath("//input[@id='continue']")).click();
			Thread.sleep(2000);
		}
		
		public void BookAHotel() throws InterruptedException
		{
			d.findElement(By.id("first_name")).sendKeys("sravani");
			Thread.sleep(2000);
			d.findElement(By.id("last_name")).sendKeys("sravs");
			Thread.sleep(2000);
			d.findElement(By.id("address")).sendKeys("hyderabad");
			Thread.sleep(2000);
			d.findElement(By.id("cc_num")).sendKeys("1234567890123456");
			Thread.sleep(2000);
			
			WebElement ele=d.findElement(By.xpath("//select[@id='cc_type']"));
			Select sc=new Select(ele);
			sc.selectByVisibleText("VISA");
			Thread.sleep(2000);
			WebElement ele1=d.findElement(By.xpath("//*[@id=\"cc_exp_month\"]"));
			Select sc1=new Select(ele1);
			sc1.selectByVisibleText("February");
			Thread.sleep(2000);
			
			WebElement ele2=d.findElement(By.xpath("//*[@id=\"cc_exp_year\"]"));
			Select sc2=new Select(ele2);
			sc2.selectByVisibleText("2012");
			Thread.sleep(2000);
			d.findElement(By.id("cc_cvv")).sendKeys("1234");
			Thread.sleep(2000);
			d.findElement(By.id("book_now")).click();
			Thread.sleep(2000);
			}
		
		public void Logout() throws InterruptedException
		{
			d.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")).click();
			Thread.sleep(2000);
		}
		
	public static void main (String[] args) throws InterruptedException
	{
		AdactinHotelapplogin ad=new AdactinHotelapplogin();
		ad.open_brower();
		ad.maximaze();
		ad.geturlAndTitle();
		ad.login();
		ad.searchHotel();
		ad.SelectHotel();
		ad.BookAHotel();
		ad.Logout();
	}
}
