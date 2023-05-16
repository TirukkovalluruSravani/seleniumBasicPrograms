package webdriver1;
//cross browser testing using conditional statement



	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class CrossBrowserUsingIfElse {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	String browser="firefox";
	if(browser.equals("chrome"))
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

	//older version of firefox 

	FirefoxDriver d1=new FirefoxDriver();
	d1.get("http://www.amazon.com");
	d1.manage().window().maximize();
	System.out.println(d1.getTitle());
	System.out.println(d1.getCurrentUrl());
	d1.close();

		}

	}
	}

