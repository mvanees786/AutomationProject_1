package pages;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonFunctions.Common;

public class Accordion extends Common {

	@FindBy(xpath = "//a[contains(text(),'Accordion')]")
	WebElement accordion;

	@FindBy(xpath = "//div[@class='accordion-header']")
	List<WebElement> accordion_Test_RadioButtons;

	public Accordion(WebDriver driver) throws AWTException {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	public void selectmenu() {
		waitForElementToBeVisible(accordion).click();

	}

	public void selectAccordion_Test_RadioButtons() {
		for (WebElement accordion_Test_RadioButton : accordion_Test_RadioButtons) {
			waitForElementToBeVisible(accordion_Test_RadioButton).click();

		}

	}
}
