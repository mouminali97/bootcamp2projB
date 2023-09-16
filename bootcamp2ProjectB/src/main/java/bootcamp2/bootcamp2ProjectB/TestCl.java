package bootcamp2.bootcamp2ProjectB;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;




public class TestCl extends baseCl {
  
  
  
  
  
  @Test
  @Parameters({"title","firstName", "middleName", "lastName", "email", "countryCode", "phoneNumber", "passport", "gender", "birthMonth", "birthDay", "birthYear"})
  public void f(String title, String firstName, String middleName, String lastName, String email, String countryCode, String phoneNumber, String passport, String gender, String birthMonth, String birthDay, String birthYear) throws InterruptedException{
	  System.out.println("This is test");
	  
	  HomePOM ob = new HomePOM(driver);
	  
	  ob.flightsTab_click();
	  ob.fill_searchFlightForm();
	  ob.selectRoundTrip();
	  ob.switchToOtherTab();
	  ob.fill_passengerInfo(title, firstName, middleName, lastName, email, countryCode, phoneNumber, passport, gender, birthMonth, birthDay, birthYear);
	  
	  
  }
  
  
  

}
