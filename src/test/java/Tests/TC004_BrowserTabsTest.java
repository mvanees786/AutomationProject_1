package Tests;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.BaseTest;

import pages.BrowserTabs;

public class TC004_BrowserTabsTest extends BaseTest {

	@Test
	public void browserTabsTests() throws AWTException, InterruptedException {
		BrowserTabs browserTabs = PageFactory.initElements(driver, BrowserTabs.class);

		browserTabs.selectMenu();
		Thread.sleep(2000);

		browserTabs.handleTabs();
		Thread.sleep(2000);
	}

}
