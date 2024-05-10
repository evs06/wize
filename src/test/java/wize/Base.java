package wize;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {

	private WebDriver driver;

	public Base(WebDriver driver) {

		this.driver = driver;
	}

	protected WebElement element(By locator) {

		return driver.findElement(locator);
	}

	
	protected void clickOn(WebElement element) {

		element.click();
	}
	
	protected void sentText(String word, WebElement element) {

		element.sendKeys(word);
	}
	
	protected void urlVist(String url) {

		driver.get(url);
	}

}
