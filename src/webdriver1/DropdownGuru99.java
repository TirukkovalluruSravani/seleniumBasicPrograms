package webdriver1;

	import java.io.File;
	import java.io.IOException;
	import java.util.List;
    import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class DropdownGuru99 {

	public static void main(String[] args) throws InterruptedException, IOException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe");
	ChromeDriver d=new ChromeDriver();
	d.get("https://demo.guru99.com/test/newtours/index.php");
	d.manage().window().maximize();
   	//click on selenium icon from the current page 
	d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();

	WebElement drop=d.findElement(By.className("dropdown-menu"));
List<WebElement>drop1=drop.findElements(By.tagName("a"));
	System.out.println(drop1.size());
	for(int i=0;i<drop1.size();i++)
	{
		System.out.println(drop1.get(i).getText());
		drop1.get(i).click();
		Thread.sleep(2000);
	    System.out.println(d.getTitle());
	    System.out.println(d.getCurrentUrl());

	d.navigate().back();
	d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
	
		 drop=d.findElement(By.className("dropdown-menu"));
		drop1=drop.findElements(By.tagName("a"));
		
	}
	//screenshot
	File a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(a1, new File("C:\\Users\\sony\\Desktop\\w3 selenium utilities\\a111.png"));
    
	d.close();
			
		}
	}

