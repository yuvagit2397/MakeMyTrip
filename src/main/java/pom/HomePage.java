package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
public static WebDriver driver;

@FindBy(id="ctl00_mainContent_ddl_originStation1")
public static WebElement fromcityBox;
public static WebElement getFromCityBox() {
	return fromcityBox;
}

@FindBy(id="ctl00_mainContent_rbtnl_Trip_1")
public static WebElement roundTrip;
public static WebElement getRoundTrip() {
	return roundTrip;
}

@FindBy(id="ctl00_mainContent_ddl_destinationStation1")
public static WebElement tocityBox;
public static WebElement getToCityBox() {
	return tocityBox;
}

@FindBy(xpath="//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[7]")
public static WebElement fromDate;
public static WebElement getFromDate() {
	return fromDate;
}

@FindBy(xpath="//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[4]")
public static WebElement returnDate;
public static WebElement getReturnDate() {
	return returnDate;
}

@FindBy(xpath="//*[@id='Div6']/span/input")
public static WebElement searchBtn;
public static WebElement getSearchBtn() {
	return searchBtn;
}

@FindBy(id="ctl00_mainContent_view_date2")
public static WebElement returnDateField;
public static WebElement getReturnDateField() {
	return returnDateField;
}

public HomePage(WebDriver hdriver) {
	this.driver=hdriver;
	PageFactory.initElements(driver, this);
}
}
