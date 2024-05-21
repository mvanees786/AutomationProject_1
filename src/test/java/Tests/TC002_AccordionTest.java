package Tests;

import java.awt.AWTException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.BaseTest;
import pages.Accordion;

public class TC002_AccordionTest extends BaseTest {

	@Test
	public void accordianTests() throws AWTException, InterruptedException {
		Accordion accordian = PageFactory.initElements(driver, Accordion.class);

		accordian.selectmenu();
		accordian.selectAccordion_Test_RadioButtons();
		Thread.sleep(2000);
	}

}
