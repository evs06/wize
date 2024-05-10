package wize;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;

public class LoginTest {

	private WebDriver driver;
	Login login;
	
	@BeforeSuite
	public WebDriver beforeSuite() {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Dell/Documents/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
	}

	@BeforeClass
	public void beforeClass() {
		
		login = new Login(driver);
		login.urlVist("https://app.todoist.com/auth/login?success_page=%2Fapp%2Ftoday");
		
	}

	@Test
	public void f() {
		
		login.Login();
		
	}

	@AfterClass
	public void afterClass() {
		
		driver.quit();
	}

}
