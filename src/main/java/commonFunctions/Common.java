package commonFunctions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {
	protected Robot robot;
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected Actions actions;
	protected JavascriptExecutor js;

	public Common(WebDriver driver) throws AWTException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		robot = new Robot();
		this.wait = new WebDriverWait(driver, 10);
		this.actions = new Actions(driver);
		js = (JavascriptExecutor) driver;

	}

	public WebElement waitForElementToBeVisible(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void windowHandle() throws InterruptedException {
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> itr = allWindows.iterator();
		String ParentWindow = itr.next();
		String ChildWindow = itr.next();
		driver.switchTo().window(ChildWindow);

	}

	public void clickEnter() {
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void alertAccept() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			System.out.println("No alert present to accept.");
		}
	}

}
