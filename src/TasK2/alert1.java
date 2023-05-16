package TasK2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\sony\\\\\\\\Desktop\\\\\\\\w3 selenium utilities\\\\\\\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
		d.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}

}
