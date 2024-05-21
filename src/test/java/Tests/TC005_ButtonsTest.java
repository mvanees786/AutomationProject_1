package Tests;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.BaseTest;

import pages.Buttons;

public class TC005_ButtonsTest extends BaseTest {

	@Test
	public void buttonsTests() throws AWTException, InterruptedException {
		Buttons btntests = PageFactory.initElements(driver, Buttons.class);

		btntests.selectMenu();

		btntests.clickBtnOne();
		btntests.clickBtnTwo();
		btntests.clickBtnThree();

		btntests.clickBtnFour();

	}

}
