package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	// Element Library
		@FindBy(how = How.ID, using = "username")
		WebElement USER_NAME_ELEMENT;
		@FindBy(how = How.XPATH, using = "//*[@id=\'password']")
		WebElement PASSWORD_ELEMENT;
		@FindBy(how = How.XPATH, using = "//button[contains(text(),'Sign in')]")
		WebElement SIGNIN_ELEMENT;
		//one will be for invalid username or password

		// Two Type Of Interactive Methods
		public void enterUserName(String userName) {
			USER_NAME_ELEMENT.sendKeys(userName);
		}

		public void enterPassword(String password) {
			PASSWORD_ELEMENT.sendKeys(password);
		}

		public void clickSigninButton() {
			SIGNIN_ELEMENT.click();
		}

}
