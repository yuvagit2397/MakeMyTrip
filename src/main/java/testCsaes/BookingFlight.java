package testCsaes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pom.HomePage;
import preRequisite.SetUpClass;
import singleton.PageObjectManager;

public class BookingFlight extends SetUpClass {
	// public static WebDriver driver=SetUpClass.driver;
	@Test(priority = 1)
	public static void placeChoosen() throws AWTException, InterruptedException {
		Thread.sleep(5000);
		// PageFactory.initElements(driver, HomePage.class);
		PageObjectManager.getHm().roundTrip.click();
		PageObjectManager.getHm().fromcityBox.click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);

		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);

		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);

		System.out.println(Keys.ENTER);

		PageObjectManager.getHm().tocityBox.click();

		robot.keyPress(KeyEvent.VK_D);
		robot.keyRelease(KeyEvent.VK_D);

		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);

		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);

		// robot.keyPress(KeyEvent.VK_G);
		// robot.keyRelease(KeyEvent.VK_G);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

	@Test(priority = 2)
	public static void dateChoosen() throws InterruptedException {
		Thread.sleep(2000);
		PageObjectManager.getHm().fromDate.click();
		Thread.sleep(2000);
		PageObjectManager.getHm().returnDateField.click();
		PageObjectManager.getHm().returnDate.click();
		Thread.sleep(2000);
		PageObjectManager.getHm().searchBtn.click();
	}

	@Test(priority = 3)
	public static void gettingFares() throws InterruptedException {
		Thread.sleep(5000);
        List<Integer> li=new ArrayList<Integer>();
		List<WebElement> flightFares = PageObjectManager.getBp().fares;
		int k=0;
		for (WebElement fares : flightFares) {
			String text = fares.getText();
			int x=text.length()-4;
			String replace = text.substring(0, x).replace(",", "");
			 int parseInt = Integer.parseInt(replace);
			if(k==0||li.get(k-1)<=parseInt) {
			li.add(parseInt);
			}else {
				li.add(parseInt);
				break;
			}
				
			k++;
			
			}
		System.out.println(li);
			
			
		}
		/*for (int i = 0; i < li.size(); i++) {
			Integer no1 = li.get(i);
			for (int j = i+1; j < li.size(); j++) {
				Integer no2 = li.get(j);
				if (no1<=no2) {
					System.out.println(no1);
					break;
				}
				else {
					System.out.println(no1);
					i=li.size();
					break;
				
			}
		}
	}*/
	}
