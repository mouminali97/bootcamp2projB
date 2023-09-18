package bootcamp2.bootcamp2ProjectB;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



//completed
public class TestCl extends baseCl {
  
  
  @Test
  @Parameters({"title","firstName", "middleName", "lastName", "email", "countryCode", "phoneNumber", "passport", "gender", "birthMonth", "birthDay", "birthYear"})
  public void f(String title, String firstName, String middleName, String lastName, String email, String countryCode, String phoneNumber, String passport, String gender, String birthMonth, String birthDay, String birthYear) throws InterruptedException{
	  System.out.println("This is test");
	  
	  HomePOM ob = new HomePOM(driver);
	  String departure = "Bandar Seri Begawan (BWN - Brunei Intl.) Brunei";
	  String arrival = "Kuala Lumpur (KUL - Kuala Lumpur Intl.) Malaysia";
	  
	  ob.flightsTab_click();
	  
	  //fill search flight form
	  ob.leavingFrom_button_click();
	  ob.fill_leavingFrom_field(departure);
	  ob.leavingFrom_field.sendKeys(Keys.ENTER);
	  
	  ob.goingTo_button_click();
	  ob.fill_goingTo_field(arrival);
	  ob.goingTo_field.sendKeys(Keys.ENTER);
	  Thread.sleep(1000);
	  
	  ob.selectCalendar_button_click();
	  
	  ob.startDate_click();
	  Thread.sleep(1000);
	  
	  ob.endDate_click();
	  Thread.sleep(1000);
	  
	  ob.done_button_click();
	  Thread.sleep(5000);
	  
	  ob.search_button_click();
	  Thread.sleep(5000);
	  
	  
	  //select round trip
	  ob.goingFlight_button_click();
	  Thread.sleep(1000);
	  ob.goingFlight_select_button_click();
	  Thread.sleep(1000);
	  
	  ob.returningFlight_button_click();
	  Thread.sleep(1000);
	  ob.returningFlight_select_button_click();
	  Thread.sleep(5000);
	  
	  
	  //switch to other tab
	  Set<String> winsession = driver.getWindowHandles();
      Iterator<String> itr = winsession.iterator();
      
      String win1 = itr.next();
      String win2 = itr.next();
      
      driver.switchTo().window(win2);
      Thread.sleep(1000);
      
      //checkout
      ob.checkOut_button_click();
      Thread.sleep(1000);
      
      ob.goTocheckOut_button_click();
      Thread.sleep(5000);
      
      
      //fill passenger info
      ob.title_dropDownMenu_select(title);
      
      ob.fill_firstName_field(firstName);
      Thread.sleep(1000);
      
      ob.fill_middleName_field(middleName);
      Thread.sleep(1000);
      
      ob.fill_lastName_field(lastName);
      Thread.sleep(1000);
      
      ob.fill_emailAddress_field(email);
      Thread.sleep(1000);
      
      ob.countryCode_dropDownMenu_select(countryCode);
      ob.fill_phoneNumber_field(phoneNumber);
      Thread.sleep(1000);
      
      ob.passport_dropDownMenu_select(passport);
      
      if (gender.contains("F")) {
      	ob.femaleGender_select_click();
      	} 
      else{
      	ob.maleGender_select_click();
      	}
      
      ob.birthMonth_dropDownMenu_select(birthMonth);
      Thread.sleep(1000);
      
      ob.birthDay_dropDownMenu_select(birthDay);
      Thread.sleep(1000);
      
      ob.birthYear_dropDownMenu_select(birthYear);
      Thread.sleep(5000);
      
  }
  
  
  

}
