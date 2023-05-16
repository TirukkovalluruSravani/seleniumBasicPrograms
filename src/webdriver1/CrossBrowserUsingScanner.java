package webdriver1;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserUsingScanner {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String browser;
		System.out.println("enter the browser name");
		browser=sc.next();
		System.out.println("the browser which u entered is :"+browser);
		if(browser.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.amazon.in");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.close();
			}
		else
			{
		FirefoxDriver d1=new FirefoxDriver();
		d1.get("http://www.amazon.com");
		d1.manage().window().maximize();
		System.out.println(d1.getTitle());
		System.out.println(d1.getCurrentUrl());
		d1.close();
			}
			}

		}

