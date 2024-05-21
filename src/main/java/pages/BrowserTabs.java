package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import commonFunctions.Common;

public class BrowserTabs extends Common {

	@FindBy(xpath = "//a[contains(text(),'Browser Tabs')]")
	WebElement BrowserTabsMenu;

	@FindBy(xpath = "//input[@value='Open Tab']")
	WebElement Open_Tab;

	public BrowserTabs(WebDriver driver) throws AWTException {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	public void selectMenu() {
		waitForElementToBeVisible(BrowserTabsMenu).click();
	}

	public void handleTabs() throws InterruptedException {

		waitForElementToBeVisible(Open_Tab).click();
		windowHandle();
		Thread.sleep(2000);
		driver.close();

	}

}
