package wize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends Base{

	@FindBy (css = "input[id=\"element-0\"]")
	private WebElement email;
	
	@FindBy (css = "input[id=\"element-3\"]")
	private WebElement password2;
	
	@FindBy (css = "button[data-gtm-id=\"start-email-login\"]")
	private WebElement buttonSign;
	
	String emailWord = "wl.interview.session@gmail.com";
	String passWord = "WL2021&*";
	
	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void Login() {
		
		sentText(emailWord, email);
		sentText(passWord, password2);
		clickOn(buttonSign);
		
		
	}
	
	

}
