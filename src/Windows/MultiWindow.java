package Windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {

	  public static void main(String[] args) throws InterruptedException {
		   	// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.dezlearn.com/multiple-browser-windows/");
		d.manage().window().maximize();
		String str=d.getWindowHandle();
		System.out.println(str);
		d.findElement(By.id("u_7_8")).click();
		Set <String> str2=d.getWindowHandles();
		System.out.println(str2);
		System.out.println(str2.size());
	/*	for(String s:str2)
		{
			d.switchTo().window(s);
			System.out.println(d.getTitle());
		} */
		Iterator i=str2.iterator();
		
		String p=(String)i.next();
		String c1=(String)i.next();
		String c2=(String)i.next();
		String c3=(String)i.next();
		String c4=(String)i.next();
		String c5=(String)i.next();
		String c6=(String)i.next();
		
		d.switchTo().window(c4);
		System.out.println(d.getTitle());
		
}}


