package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonFunctions.Common;

public class Buttons extends Common {

	@FindBy(xpath = "//a[contains(text(),'Buttons')]")
	WebElement buttonsMenu;

	@FindBy(xpath = "//button[text()='Button One']")
	WebElement buttonOne;

	@FindBy(xpath = "//button[text()='Button Two']")
	WebElement buttonTwo;

	@FindBy(xpath = "//button[text()='Button Three']")
	WebElement buttonThree;

	@FindBy(xpath = "//button[text()='Button Four']")
	WebElement buttonFour;

	public Buttons(WebDriver driver) throws AWTException {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	public void selectMenu() throws InterruptedException {
		waitForElementToBeVisible(buttonsMenu).click();
		Thread.sleep(2000);
	}

	public void clickBtnOne() throws InterruptedException {
		Thread.sleep(1000);
		buttonOne.click();
		Thread.sleep(1000);
		alertAccept();
	}

	public void clickBtnTwo() throws InterruptedException {

		js.executeScript("arguments[0].click();", buttonTwo);
		Thread.sleep(1000);
		alertAccept();
	}

	public void clickBtnThree() throws InterruptedException {
		Thread.sleep(1000);
		actions.moveToElement(buttonThree).click().perform();
		Thread.sleep(1000);
		alertAccept();
	}

	public void clickBtnFour() {

		System.out.println("Button Four is :" + buttonFour.isEnabled());

	}
}
