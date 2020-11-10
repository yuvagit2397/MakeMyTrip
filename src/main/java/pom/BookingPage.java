package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
	
	 public static WebDriver driver;
	@FindBy(xpath="//p[@productclass='Spice Flex']/label/child::span[1]")
	public static List<WebElement> fares;
	public static List<WebElement> getfares() {
		return fares;
	}
	public BookingPage(WebDriver bdriver) {
		this.driver=bdriver;
		PageFactory.initElements(driver, this);
	}
}
