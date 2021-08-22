package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {

	WebDriver drive;

	public DashboardPage(WebDriver driver) {
		this.drive = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//H2[contains(text(),' Dashboard ')]")
	WebElement DASHBOARD_VALIDATION_ELEMENT;

	// Interactive Method

	public void validateDashboard() {
		Assert.assertEquals(DASHBOARD_VALIDATION_ELEMENT.getText(), "Dashboard", "Wrong page!!");

	}

}
