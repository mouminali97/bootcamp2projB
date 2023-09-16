package bootcamp2.bootcamp2ProjectB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class baseCl {
	public static WebDriver driver;
	
	@BeforeMethod
	@Parameters({"brow"})
	public void beforeMethod(String brow) throws InterruptedException {
		System.out.println("This is beforeMethod");
		browserSelect(brow);
		driver.get("https://www.expedia.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	  }
	
	
	
	
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		System.out.println("This is afterMethod");
		Thread.sleep(5000);
		driver.quit();
	  }
	
	
	
	
	
	public void browserSelect(String browser) {
		if(browser.contains("Chrome")) {
			//Chrome driver
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Moumin\\eclipse-workspace\\mavenbatch7\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
	  }
	  
		else if(browser.contains("Firefox")) {
			//Firefox driver
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Moumin\\eclipse-workspace\\mavenbatch7\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
	  }
	  
		else {
			//Edge driver
			System.setProperty("webdriver.edge.driver","C:\\Users\\Moumin\\eclipse-workspace\\mavenbatch7\\drivers\\msedgedriver.exe");
		    driver = new EdgeDriver();
		      }
	  }

}
