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
	WebElement selectCalendar_button;
	
	@FindBy (xpath = "(//*[@class='uitk-day-button uitk-day-selectable uitk-day-clickable'])[5]")
	WebElement startDate;
	
	@FindBy (xpath = "(//*[@class='uitk-day-button uitk-day-selectable uitk-day-clickable'])[11]")
	WebElement endDate;
	
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
	
	public void leavingFrom_button_click() {
		WebDriverWait ob = new WebDriverWait(driver, 20); // Explicit wait
		ob.until(ExpectedConditions.elementToBeClickable(leavingFrom_button)).click();
	}
	
	public void fill_leavingFrom_field(String departure) {
		leavingFrom_field.sendKeys(departure);
	}
	
	public void goingTo_button_click() {
		WebDriverWait ob = new WebDriverWait(driver, 20); // Explicit wait
		ob.until(ExpectedConditions.elementToBeClickable(goingTo_button)).click();
	}
	
	public void fill_goingTo_field(String arrival) {
		goingTo_field.sendKeys(arrival);
	}
	
	public void selectCalendar_button_click() {
		WebDriverWait ob = new WebDriverWait(driver, 20); // Explicit wait
		ob.until(ExpectedConditions.elementToBeClickable(selectCalendar_button)).click();
	}
	
	public void startDate_click() {
		WebDriverWait ob = new WebDriverWait(driver, 20); // Explicit wait
		ob.until(ExpectedConditions.elementToBeClickable(startDate)).click();
	}
	
	public void endDate_click() {
		WebDriverWait ob = new WebDriverWait(driver, 20); // Explicit wait
		ob.until(ExpectedConditions.elementToBeClickable(endDate)).click();
	}
	
	public void done_button_click() {
		WebDriverWait ob = new WebDriverWait(driver, 20); // Explicit wait
		ob.until(ExpectedConditions.elementToBeClickable(done_button)).click();
	}
	
	public void search_button_click() {
		WebDriverWait ob = new WebDriverWait(driver, 20); // Explicit wait
		ob.until(ExpectedConditions.elementToBeClickable(search_button)).click();
	}
	
	
	public void goingFlight_button_click() {
		WebDriverWait ob = new WebDriverWait(driver, 50); // Explicit wait
		ob.until(ExpectedConditions.elementToBeClickable(goingFlight_button)).click();
	}
	
	public void goingFlight_select_button_click() {
		WebDriverWait ob = new WebDriverWait(driver, 20); // Explicit wait
		ob.until(ExpectedConditions.elementToBeClickable(goingFlight_select_button)).click();
	}
	
	public void returningFlight_button_click() {
		WebDriverWait ob = new WebDriverWait(driver, 20); // Explicit wait
		ob.until(ExpectedConditions.elementToBeClickable(returningFlight_button)).click();
	}
	
	public void returningFlight_select_button_click() {
		WebDriverWait ob = new WebDriverWait(driver, 20); // Explicit wait
		ob.until(ExpectedConditions.elementToBeClickable(returningFlight_select_button)).click();
	}
	
	
	public void checkOut_button_click() {
		WebDriverWait ob = new WebDriverWait(driver, 20); // Explicit wait
		ob.until(ExpectedConditions.elementToBeClickable(checkOut_button)).click();
	}
	
	public void goTocheckOut_button_click() {
		WebDriverWait ob = new WebDriverWait(driver, 20); // Explicit wait
		ob.until(ExpectedConditions.elementToBeClickable(goTocheckOut_button)).click();
	}
	
	public void title_dropDownMenu_select(String title) {
		Select ob = new Select(title_dropDownMenu);
        ob.selectByVisibleText(title);
	}
	
	public void fill_firstName_field(String firstName) {
		firstName_field.sendKeys(firstName);
	}
	
	public void fill_middleName_field(String middleName) {
		middleName_field.sendKeys(middleName);
	}
	
	public void fill_lastName_field(String lastName) {
		lastName_field.sendKeys(lastName);
	}
	
	public void fill_emailAddress_field(String email) {
		emailAddress_field.sendKeys(email);
	}
	
	public void countryCode_dropDownMenu_select(String countryCode) {
		Select ob = new Select(countryCode_dropDownMenu);
        ob.selectByVisibleText(countryCode);
	}
	
	public void fill_phoneNumber_field(String phoneNumber) {
		phoneNumber_field.sendKeys(phoneNumber);
	}
	
	public void passport_dropDownMenu_select(String passport) {
		Select ob = new Select(passport_dropDownMenu);
        ob.selectByVisibleText(passport);
	}
	
	public void femaleGender_select_click() {
		femaleGender_select.click();
	}
	
	public void maleGender_select_click() {
		maleGender_select.click();
	}
	
	public void birthMonth_dropDownMenu_select(String birthMonth) {
		Select ob = new Select(birthMonth_dropDownMenu);
        ob.selectByVisibleText(birthMonth);
	}
	
	public void birthDay_dropDownMenu_select(String birthDay) {
		Select ob = new Select(birthDay_dropDownMenu);
        ob.selectByVisibleText(birthDay);
	}
	
	public void birthYear_dropDownMenu_select(String birthYear) {
		Select ob = new Select(birthYear_dropDownMenu);
        ob.selectByVisibleText(birthYear);
	}
	
	

}
