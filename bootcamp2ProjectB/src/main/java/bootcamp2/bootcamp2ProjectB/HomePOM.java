package bootcamp2.bootcamp2ProjectB;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePOM {
	public static WebDriver driver;
	
	//WebElements
	@FindBy (xpath = "//*[@aria-controls='search_form_product_selector_flights']")
	WebElement flightsTab;
		
	@FindBy (xpath = "//*[@aria-label='Leaving from']")
	WebElement leavingFrom_button;
	
	@FindBy (xpath = "//*[@id='origin_select']")
	WebElement leavingFrom_field;
	
	@FindBy (xpath = "//*[@aria-label='Going to']")
	WebElement goingTo_button;
	
	@FindBy (xpath = "//*[@id='destination_select']")
	WebElement goingTo_field;
	
	@FindBy (xpath = "//*[@data-stid='uitk-date-selector-input1-default']")
	WebElement selectDates_button;
	
	@FindBy (xpath = "(//*[@class='uitk-day-button uitk-day-selectable uitk-day-clickable'])[5]")
	WebElement startDate;
	//Tuesday, September 19, 2023
	
	@FindBy (xpath = "(//*[@class='uitk-day-button uitk-day-selectable uitk-day-clickable'])[11]")
	WebElement endDate;
	//Monday, September 25, 2023
	
	@FindBy (xpath = "//*[text()='Done']")
	WebElement done_button;
	
	@FindBy (xpath = "//*[text()='Search']")
	WebElement search_button;
	
	@FindBy (xpath = "//*[@stid=\"FLIGHTS_DETAILS_AND_FARES-index-1-leg-0-fsr-FlightsActionButton\"]")
	WebElement goingFlight_button;
	
	@FindBy (xpath = "//*[@stid='select-button']")
	WebElement goingFlight_select_button;
	
	@FindBy (xpath = "//*[@stid='FLIGHTS_DETAILS_AND_FARES-index-1-leg-1-fsr-FlightsActionButton']")
	WebElement returningFlight_button;
	
	@FindBy (xpath = "//*[@stid='select-button']")
	WebElement returningFlight_select_button;
	
	@FindBy (xpath = "//*[@data-stid='goto-checkout-button']")
	WebElement checkOut_button;
	
	@FindBy (xpath = "//*[@data-stid='nudge-goto-checkout-button']")
	WebElement goTocheckOut_button;
	
	@FindBy (xpath = "//*[@id='title[0]']")
	WebElement title_dropDownMenu;
	
	@FindBy (xpath = "//*[@id='firstname[0]']")
	WebElement firstName_field;
	
	@FindBy (xpath = "//*[@id='middlename[0]']")
	WebElement middleName_field;
	
	@FindBy (xpath = "//*[@id='lastname[0]']")
	WebElement lastName_field;
	
	@FindBy (xpath = "//*[@placeholder='Email for confirmation']")
	WebElement emailAddress_field;
	
	@FindBy (xpath = "//*[@id='country_code[0]']")
	WebElement countryCode_dropDownMenu;
	
	@FindBy (xpath = "//*[@id='phone-number[0]']")
	WebElement phoneNumber_field;
	
	@FindBy (xpath = "//*[@id='passport[0]']")
	WebElement passport_dropDownMenu;
	
	@FindBy (xpath = "//*[@id='gender_male[0]']")
	WebElement maleGender_select;
	
	@FindBy (xpath = "//*[@id='gender_female[0]']")
	WebElement femaleGender_select;
	
	@FindBy (xpath = "//*[@id='date_of_birth_month0']")
	WebElement birthMonth_dropDownMenu;
	
	@FindBy (xpath = "//*[@id='date_of_birth_day[0]']")
	WebElement birthDay_dropDownMenu;
	
	@FindBy (xpath = "//*[@id='date_of_birth_year[0]']")
	WebElement birthYear_dropDownMenu;
	
	
	//PageFactory constructor
	public HomePOM(WebDriver driver) {
		HomePOM.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Methods for each action
	public void flightsTab_click(){
		flightsTab.click();
	}
	
	public void fill_searchFlightForm() throws InterruptedException{
		
		String departure = "Bandar Seri Begawan (BWN - Brunei Intl.) Brunei";
		String arrival = "Kuala Lumpur (KUL - Kuala Lumpur Intl.) Malaysia";
		
		WebDriverWait ob = new WebDriverWait(driver,20); //Explicit wait
		
		ob.until(ExpectedConditions.elementToBeClickable(leavingFrom_button)).click();
		leavingFrom_field.sendKeys(departure);
		leavingFrom_field.sendKeys(Keys.ENTER);
		
		ob.until(ExpectedConditions.elementToBeClickable(goingTo_button)).click();
		goingTo_field.sendKeys(arrival);
		goingTo_field.sendKeys(Keys.ENTER);
		
		ob.until(ExpectedConditions.elementToBeClickable(selectDates_button)).click();
		ob.until(ExpectedConditions.elementToBeClickable(startDate)).click();
		Thread.sleep(1000);
        ob.until(ExpectedConditions.elementToBeClickable(endDate)).click();
        Thread.sleep(1000);
        ob.until(ExpectedConditions.elementToBeClickable(done_button)).click();
        Thread.sleep(5000);
        ob.until(ExpectedConditions.elementToBeClickable(search_button)).click();
	}
	
	
	public void selectRoundTrip() throws InterruptedException {
		WebDriverWait ob = new WebDriverWait(driver,20); //Explicit wait
		
		ob.until(ExpectedConditions.elementToBeClickable(goingFlight_button)).click();
		Thread.sleep(1000);
		ob.until(ExpectedConditions.elementToBeClickable(goingFlight_select_button)).click();
		Thread.sleep(1000);
		ob.until(ExpectedConditions.elementToBeClickable(returningFlight_button)).click();
		Thread.sleep(1000);
		ob.until(ExpectedConditions.elementToBeClickable(returningFlight_select_button)).click();
		Thread.sleep(5000);
		
	}
	
	
	public void switchToOtherTab() throws InterruptedException {
		WebDriverWait ob = new WebDriverWait(driver,20);
		
		Set<String> winsession = driver.getWindowHandles();
        Iterator<String> itr = winsession.iterator();
        
        String win1 = itr.next();
        String win2 = itr.next();
        
        driver.switchTo().window(win2);
        Thread.sleep(1000);
        
        ob.until(ExpectedConditions.elementToBeClickable(checkOut_button)).click();
		Thread.sleep(1000);
		ob.until(ExpectedConditions.elementToBeClickable(goTocheckOut_button)).click();
		Thread.sleep(5000);
	}
	
	
	public void fill_passengerInfo(String title, String firstName, String middleName, String lastName, String email, String countryCode, String phoneNumber, String passport, String gender, String birthMonth, String birthDay, String birthYear) throws InterruptedException {
		
		Select ob = new Select(title_dropDownMenu);
        ob.selectByVisibleText(title);
        
        firstName_field.sendKeys(firstName);
        Thread.sleep(1000);
        middleName_field.sendKeys(middleName);
        Thread.sleep(1000);
        lastName_field.sendKeys(lastName);
        Thread.sleep(1000);
        
        emailAddress_field.sendKeys(email);
        Thread.sleep(1000);
        
        Select ob2 = new Select(countryCode_dropDownMenu);
        ob2.selectByVisibleText(countryCode);
        
        phoneNumber_field.sendKeys(phoneNumber);
        Thread.sleep(1000);
        
        Select ob3 = new Select(passport_dropDownMenu);
        ob3.selectByVisibleText(passport);
        
        
        if (gender.contains("F")) {
        	femaleGender_select.click();
        	} 
        else{
        	maleGender_select.click();
        	} 
        
        
        Select ob4 = new Select(birthMonth_dropDownMenu);
        ob4.selectByVisibleText(birthMonth);
        Thread.sleep(1000);
        
        Select ob5 = new Select(birthDay_dropDownMenu);
        ob5.selectByVisibleText(birthDay);
        Thread.sleep(1000);
        
        Select ob6 = new Select(birthYear_dropDownMenu);
        ob6.selectByVisibleText(birthYear);
        Thread.sleep(5000);
        
        
	}
	

}
