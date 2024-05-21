package Tests;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.BaseTest;

import pages.Action;

public class TC003_ActionsTest extends BaseTest {

	@Test()
	public void actionsTests() throws InterruptedException, AWTException {
	
		Action act = PageFactory.initElements(driver, Action.class);
		act.selectMenu();
		act.dragAndDrop();
		act.clickAndHold();
		act.doubleClick();
		act.holdShiftAndClick();
	}
}
