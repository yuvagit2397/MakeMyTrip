package preRequisite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SetUpClass {
	public static Properties prop;
	public static WebDriver driver;
   
	public static Properties getProperty() throws IOException {
		String s = "D:\\yuvasri_revision\\Makemytrip\\src\\main\\java\\preRequisite\\Property.properties";
		FileInputStream fis = new FileInputStream(s);
		prop=new Properties();
		prop.load(fis);
		return prop;
	}
	
	 @BeforeClass
	 
	 public static void browserLaunch() throws IOException {
		 getProperty();
		 String browser = prop.getProperty("browser");
		 System.out.println(browser);
		 String url = prop.getProperty("url");
		 
		 if (browser.equalsIgnoreCase("chrome")) {
			 
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		 driver.get(url);
	
	}
	 
	 @AfterClass
	 public void teardown() {

	}
	
}
