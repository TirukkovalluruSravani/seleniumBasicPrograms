package Windows;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiWindowUsingMethods {

	
		WebDriver d;
		String s="https://www.dezlearn.com/multiple-browser-windows/";
		public void open_brower() {
			WebDriverManager.chromedriver().setup();
			d= new ChromeDriver();
		}
		public void navigate()
		{
			d.get(s);
			d.manage().window().maximize();
			String parent_id=d.getWindowHandle();
			System.out.println(parent_id);
			d.findElement(By.id("u_7_8")).click();
			Set<String> child=d.getWindowHandles();
			System.out.println(child);
			for(String s:child)
			{	
				d.switchTo().window(s);
				System.out.println(d.getTitle());
				
			}
			String[] handles = child.toArray(new String[child.size()]);
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter page name");
			String page=sc.next();
			System.out.println("you entered "+page);		
			if(page.equals("Facebook"))
			{
			d.switchTo().window(handles[6]);
			d.findElement(By.id("email")).sendKeys("Sra123@gmail.com");
			d.findElement(By.id("pass")).sendKeys("Sravani");
			}
			else if(page.equals("YouTube"))
			{
				d.switchTo().window(handles[5]);
				d.findElement(By.xpath("//input[@id='search']")).sendKeys("mounam");
			}
			else if(page.equals("LinkedIn"))
			{
				d.switchTo().window(handles[4]);
				d.findElement(By.id("session_key")).sendKeys("Sra123@gmail.com");
				d.findElement(By.id("session_password")).sendKeys("Sravani");
			}
			else if(page.equals("Twitter"))
			{
				d.switchTo().window(handles[3]);
				d.findElement(By.xpath("//input")).sendKeys("nag");
			}
			else if(page.equals("Apple"))
			{
				d.switchTo().window(handles[2]);
			}
			else if(page.equals("Google"))
			{
				d.switchTo().window(handles[1]);
				d.findElement(By.name("q")).sendKeys("Sravani ");
			}
			else if(page.equals("Dezlearn"))
			{
				d.switchTo().window(handles[0]);
			}
		}
		public static void main(String args[])
		{
			multiWindowUsingMethods m= new multiWindowUsingMethods();
			m.open_brower();
			m.navigate();
		}
		

	}

