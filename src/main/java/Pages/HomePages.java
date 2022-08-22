package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePages {
	private WebDriver driver;
	private By formAuthenticationLink =By.linkText("Form Authentication");

	public HomePages(WebDriver driver) {//constructor used
		this.driver=driver;
	}
	
	public LoginPage clickFormAuthentication() {
		driver.findElement(formAuthenticationLink).click();
		return new LoginPage(driver);
	}
	
	
}
