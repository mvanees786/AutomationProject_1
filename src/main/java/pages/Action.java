package pages;

import java.awt.AWTException;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonFunctions.Common;

public class Action extends Common {

	@FindBy(xpath = "//a[contains(text(),'Actions')]")
	WebElement ActionsMenu;

	@FindBy(xpath = "//p[@draggable='true']")
	WebElement DragMe_Source;

	@FindBy(xpath = "(//div[@class='droptarget'])[2]")
	WebElement DragMe_Destination;

	@FindBy(xpath = "//p[text()='Click and Hold!']")
	WebElement ClickandHold;

	@FindBy(xpath = "//p[text()='Double Click Here']")
	WebElement DoubleClick;

	@FindBy(xpath = "//p[text()='Hold Shift & Click Here']")
	WebElement HoldShiftClickHere;

	public Action(WebDriver driver) throws AWTException {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	public void selectMenu() {

		waitForElementToBeVisible(ActionsMenu).click();
	}

	public void dragAndDrop() throws InterruptedException {
		actions.dragAndDrop(DragMe_Source, DragMe_Destination).perform();

	}

	public void clickAndHold() {

		actions.clickAndHold(ClickandHold).perform();
	}

	public void doubleClick() {
		actions.doubleClick(DoubleClick).perform();
	}

	public void holdShiftAndClick() throws InterruptedException, AWTException {
		actions.keyDown(Keys.SHIFT).click(HoldShiftClickHere).perform();
		Thread.sleep(2000);

		clickEnter();

	}

}
