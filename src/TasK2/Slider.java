package TasK2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {
	
		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver d=new ChromeDriver();
	
			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			d.get("https://www.flipkart.com/clothing-and-accessories/bottomwear/~cs-8lfwh63l75/pr?sid=clo,vua&p[]=facets.discount_range_v1%255B%255D%3D50%2525%2Bor%2Bmore&p[]=facets.fulfilled_by%255B%255D%3DPlus%2B%2528FAssured%2529&p[]=facets.price_range.from%3DMin&p[]=facets.price_range.to%3DMax&p[]=facets.ideal_for%255B%255D%3DMen&otracker=categorytree");
			//d.get("https://www.flipkart.com/clothing-and-accessories/topwear/pr?sid=clo%2Cash&p%5B%5D=facets.price_range.from%3D300&otracker=categorytree&fm=neo%2Fmerchandising&iid=M_4a3bb209-7f27-414e-8b4d-220e74b3fad3_1_372UD5BXDFYS_MC.6XNZG1FYFBZT&otracker=hp_rich_navigation_1_1.navigationCard.RICH_NAVIGATION_Fashion%7EMen%2527s%2BTop%2BWear_6XNZG1FYFBZT&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L1_view-all&cid=6XNZG1FYFBZT&p%5B%5D=facets.price_range.to%3D1000&p%5B%5D=facets.ideal_for%255B%255D%3DMen");
			d.manage().window().maximize();
			
			WebElement w= d.findElement(By.xpath("//div[@class='_12FhcQ']"));
			Actions a= new Actions(d);
	    	int x=w.getLocation().x;
	    	
			a.dragAndDropBy(w,x,10).build().perform();
			System.out.print(w.getText());

		}

	}


