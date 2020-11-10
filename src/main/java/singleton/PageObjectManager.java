package singleton;

import org.openqa.selenium.WebDriver;

import pom.BookingPage;
import pom.HomePage;
import preRequisite.SetUpClass;

public class PageObjectManager {
	public static WebDriver driver=SetUpClass.driver;
	private static HomePage hm;
	private static BookingPage bp;
	private PageObjectManager() {
		
	}
	
	public static HomePage getHm() {
		if (hm==null) {
			hm=new HomePage(driver);
		}
		return hm;
	}
	
	public static BookingPage getBp() {
		if(bp==null) {
			bp=new BookingPage(driver);
		}
		return bp;
	}

}
