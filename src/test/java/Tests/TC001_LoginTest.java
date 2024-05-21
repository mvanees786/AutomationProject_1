package Tests;

import org.testng.annotations.Test;

import Base.BaseTest;

public class TC001_LoginTest extends BaseTest {

	@Test()
	public void testLogin() {

		System.out.println("Title:" + driver.getTitle());
	}
	
	
}