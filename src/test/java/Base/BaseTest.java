package Base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
	protected WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/mvanees/eclipse-workspace/AutomationProject_1/src/main/resources/DataFiles/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//String url = "https://automationtesting.co.uk/";
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://automationtesting.co.uk/");
		Thread.sleep(5000);
	}

	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
