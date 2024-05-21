package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.*;

public class BaseTest {
	protected WebDriver driver;
	protected String url = "https://automationtesting.co.uk/";

	@BeforeSuite
	public void setUp() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/mvanees/eclipse-workspace/AutomationProject_1/src/main/resources/DataFiles/chromedriver-win64/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		this.driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(url);

	}

	@AfterSuite()
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
