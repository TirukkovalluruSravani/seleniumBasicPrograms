package Task1ByKiran;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Actions_Doubleclick {
		public static void main(String[] args) throws InterruptedException {
			//initialize the web driver
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sony\\Desktop\\w3 selenium utilities\\chromedriver.exe"); 
			ChromeDriver d =new ChromeDriver();
			//get the application 
		d.navigate().to("https://demoqa.com/buttons"); 
		//maximize the window
		d.manage().window().maximize();
		//pause for 3 seconds
			Thread.sleep(3000);
			//for double click action
			Actions act=new Actions(d);
			act.doubleClick(d.findElement(By.id("doubleClickBtn"))).build().perform();
			//or you can you act.doubleClick(d.findElement(By.id("doubleClickBtn"))).perform();
		
			//if double click action is performed then this messege will display on console window
			System.out.println("the double click action is completed");
			//to print the messege after double click action perform
		//	WebElement w=d.findElement(By.id("doubleClickMessage"));
		//	System.out.println(w.getText());

		}

	}

